package com.randioo.sihao_server.module.gm.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.mina.core.session.IoSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randioo.randioo_server_base.cache.RoleCache;
import com.randioo.randioo_server_base.cache.SessionCache;
import com.randioo.randioo_server_base.entity.RoleInterface;
import com.randioo.randioo_server_base.module.BaseService;
import com.randioo.randioo_server_base.utils.system.Platform;
import com.randioo.randioo_server_base.utils.system.Platform.OS;
import com.randioo.randioo_server_base.utils.system.SignalTrigger;
import com.randioo.randioo_server_base.utils.system.SystemManager;
import com.randioo.randioo_server_base.utils.template.Function;
import com.randioo.sihao_server.SessionCloseHandler;
import com.randioo.sihao_server.entity.bo.Role;
import com.randioo.sihao_server.util.GameDB;

@Service("gmService")
public class GmServiceImpl extends BaseService implements GmService {

	@Autowired
	private SystemManager systemManager;

	@Autowired
	private GameDB gameDB;

	@Override
	public void init() {
		Function function = new Function() {

			@Override
			public Object apply(Object... params) {
				systemManager.close();

				System.out.println("port close");

				try {
					// 保存线程池停止
					gameDB.getUpdatePool().shutdownNow();
					gameDB.setUpdatePoolClose(true);
					// 定时保存线程池停止
					gameDB.getScheduledPool().shutdownNow();
				} catch (Exception e) {
					e.printStackTrace();
				}

				// 所有人下线
				everybodyOffline();

				// 上交一个消息以防插入的数据还没有保存好
				gameDB.getInsertPool().submit(new Runnable() {

					@Override
					public void run() {
						// 数据保存
						System.out.println("start save");
						saveData();
						System.out.println("save complete");
						System.exit(0);
					}

				});

				return null;
			}

		};

		// 命令关闭信号
		try {
			System.out.println(Platform.getOS());
			if (Platform.getOS() == OS.WIN)
				SignalTrigger.setSignCallback("INT", function);
			else if (Platform.getOS() == OS.LINUX)
				SignalTrigger.setSignCallback("ABRT", function);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 玩家信息定期保存
		gameDB.getScheduledPool().scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				if (!gameDB.isUpdatePoolClose()) {
					saveData(gameDB.getUpdatePool());
				}
			}

		}, 1, 30, TimeUnit.MINUTES);
	}

	/**
	 * 所有人下线
	 * 
	 * @author wcy 2016年12月9日
	 */
	private void everybodyOffline() {
		// 所有人下线,一旦断开会自动调用SessionCloseHandler.synManipulate方法
		Collection<IoSession> allSession = SessionCache.getAllSession();
		Iterator<IoSession> it = allSession.iterator();
		while (it.hasNext()) {
			it.next().close(true);
		}

	}

	/**
	 * 数据保存
	 */
	private void saveData(ExecutorService savePool) {
		if (savePool != null) {
			savePool.submit(new Runnable() {

				@Override
				public void run() {
					saveData();
				}
			});
		}

	}

	private void saveData() {
		for (RoleInterface roleInterface : RoleCache.getRoleMap().values()) {
			try {
				SessionCloseHandler.roleDataCache2DB((Role) roleInterface);
			} catch (Exception e) {
				System.out.println("Role: " + roleInterface.getRoleId() + " saveError!");
				e.printStackTrace();
			}
		}

	}

}
