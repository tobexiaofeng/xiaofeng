package com.indi.main;

import com.indi.task.DeadThread;

public class DeadLock {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		DeadThread d1 = new DeadThread(true,01,02);
		DeadThread d2 = new DeadThread(false,01,02);
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();
	}

}
