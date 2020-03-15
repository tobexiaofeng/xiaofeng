package com.indi.task;

public class Bank{

	private int count = 0;
	
	public synchronized void add(int num) {
		count += num;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"......"+count);
	}

}
