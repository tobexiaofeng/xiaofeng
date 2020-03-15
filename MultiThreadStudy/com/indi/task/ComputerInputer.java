package com.indi.task;

import com.indi.executor.Computer;

public class ComputerInputer implements Runnable {
	Computer computer = new Computer();
	int count = 0;
	
	public ComputerInputer(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public void run() {		
		while(true) {			
			if(count==0) {
				computer.setInfo("����","��Ա");
			}else {
				computer.setInfo("����","����");						
			}						
			count = ++count%2;												
		}		
	}
}
