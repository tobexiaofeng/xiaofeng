package com.indi.task;

public class Ticket implements Runnable{

	private int tickets = 100;

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	@Override
	public void run() {
		while(true) {
			synchronized(this){
				if(tickets > 0) {
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+ "......" + tickets--);
				}
			}
			
		}		
	}
	
}
