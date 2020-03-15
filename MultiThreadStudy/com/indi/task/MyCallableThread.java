package com.indi.task;

import java.util.concurrent.Callable;

public class MyCallableThread implements Callable<String> {

	private int count = 100;
	@Override
	public String call() throws Exception {
		for(;count > 0;count--) {
			System.out.println("当前剩余的票" + count);
		}
		return "卖光了";
	}

}
