package com.indi.main;

import com.indi.task.Bank;
import com.indi.task.Depositor;

public class ThreadBankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Depositor d1 = new Depositor(bank);
		Depositor d2 = new Depositor(bank);
		Thread t0 = new Thread(d1,"´¢»§¼×");
		Thread t1 = new Thread(d2,"´¢»§ÒÒ");
		
		t0.start();
		t1.start();
	}

}
