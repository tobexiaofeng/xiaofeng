package com.indi.main;

import com.indi.task.Ticket;

public class ThreadTicketTest {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread t1 = new Thread(ticket);
		Thread t2 = new Thread(ticket);
		Thread t3 = new Thread(ticket);
		Thread t4 = new Thread(ticket);
		
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
	}

}
