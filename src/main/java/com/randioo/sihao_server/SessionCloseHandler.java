package com.randioo.sihao_server;

import com.randioo.randioo_server_base.cache.SessionCache;
import com.randioo.randioo_server_base.net.SpringContext;
import com.randioo.sihao_server.db.dao.RoleDao;
import com.randioo.sihao_server.entity.bo.Role;
import com.randioo.sihao_server.util.DBRunnable;
import com.randioo.sihao_server.util.GameDB;

/**
 * session关闭角色数据处理
 * 
 */
public class SessionCloseHandler {
	/**
	 * 移除session缓存
	 * 
	 * @param id
	 */
	public static void synManipulate(Role role) {
		System.out.println("[account:" + role.getAccount() + ",name:" + role.getName() + "] manipulate");

		SessionCache.removeSessionById(role.getRoleId());

		GameDB gameDB = SpringContext.getBean("gameDB");
		if (!gameDB.isUpdatePoolClose()) {
			gameDB.getUpdatePool().submit(new DBRunnable<Role>(role) {

				@Override
				public void run(Role role) {
					roleDataCache2DB(role);
				}
			});
		}
	}

	public static void roleDataCache2DB(Role role) {
		try {
			RoleDao roleDao = (RoleDao) SpringContext.getBean("roleDao");

			if (role.isChange()) {
				roleDao.updateRole(role);
				role.setChange(false);
			}

			System.out.println("[account:" + role.getAccount() + " name:" + role.getName() + "] manipulate Success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("role:" + role.getAccount() + " save error");
		}

	}

}
