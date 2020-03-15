package com.indi.executor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {

	private int count = 0;
	boolean flag = false;
	
	Lock lock = new ReentrantLock();
	
	Condition pro_con = lock.newCondition();
	Condition con_con = lock.newCondition();
	
	public void produce() {
		try {
			lock.lock();
			while(flag) {
				try {
					pro_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			flag = true;
			con_con.signal();
			System.out.println(Thread.currentThread().getName()+ "生产者生产烤鸭"+ "..." + ++count);
		}finally {
			lock.unlock();
		}		
	}
	
	public void consume() {		
		try {
			lock.lock();
			while(!flag) {
				try {
					con_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			flag = false;
			pro_con.signal();
			System.out.println(Thread.currentThread().getName()+ "消费者消费烤鸭" + "...... "+ count);
		} finally {
			lock.unlock();
		}		
	}
}
