package com.randioo.sihao_server.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.springframework.stereotype.Service;

@Service("gameDB")
public class GameDB {
	private ExecutorService updatePool = Executors.newFixedThreadPool(20);
	private ExecutorService insertPool = Executors.newFixedThreadPool(15);
	private ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(1);
	private boolean close;

	public ExecutorService getUpdatePool() {
		return updatePool;
	}

	public ExecutorService getInsertPool() {
		return insertPool;
	}

	public ScheduledExecutorService getScheduledPool() {
		return scheduledPool;
	}

	public void setUpdatePoolClose(boolean close) {
		this.close = close;
	}

	public boolean isUpdatePoolClose() {
		return close;
	}
}
