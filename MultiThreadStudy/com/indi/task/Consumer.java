package com.indi.task;

import com.indi.executor.Resource;

public class Consumer implements Runnable {
	private Resource resource;
	
	public Consumer(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		while(true) {
			resource.consume();;
		}
	}
}
