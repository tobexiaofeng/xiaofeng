package com.indi.task;

import com.indi.executor.Computer;

public class ComputerOutputer implements Runnable {
	Computer computer = new Computer();
	int count = 0;
	
	public ComputerOutputer(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void run() {		
		while(true) {
			computer.show();	
		}
	}
}
