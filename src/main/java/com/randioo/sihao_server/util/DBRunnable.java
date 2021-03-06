package com.randioo.sihao_server.util;

/**
 * 数据库线程
 * @author AIM
 *
 * @param <T>
 */
public abstract class DBRunnable<T> implements Runnable {

	private T  t;

	public DBRunnable(T t) {
		this.t = t;
	}

	@Override
	public void run(){
		try{
			run(t);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public abstract void run(T t);

}
