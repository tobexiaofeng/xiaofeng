package com.indi.task;

public class Depositor implements Runnable {
	private Bank bank;
	
	public Depositor(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		for(var i = 0;i < 3;i ++) {
			bank.add(100);
		}
	}

}
