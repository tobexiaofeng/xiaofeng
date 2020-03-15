package com.indi.main;

import com.indi.executor.Resource;
import com.indi.task.Consumer;
import com.indi.task.Producer;

public class ProConTest {
	public static void main(String[] args) {
		Resource resource = new Resource();
		
		Producer producer = new Producer(resource);
		Consumer consumer = new Consumer(resource);
		
		Thread t0 = new Thread(producer);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		Thread t3 = new Thread(consumer);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
