package com.indi.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.indi.task.MyCallableThread;

public class CallableTest {

	public static void main(String[] args) {
		MyCallableThread mt = new MyCallableThread();
		
		FutureTask<String> futureTask = new FutureTask<>(mt);
		
		Thread t0 = new Thread(futureTask);
		Thread t1 = new Thread(futureTask);
		Thread t2 = new Thread(futureTask);
		
		t0.start();
		t1.start();
		t2.start();
		
		try {
			System.out.println(futureTask.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
