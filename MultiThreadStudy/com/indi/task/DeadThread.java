package com.indi.task;

public class DeadThread implements Runnable {

	private Boolean flag;
	private Object MyLocka;
	private Object MyLockb;
	public DeadThread(Object...objects) {
		this.flag = (Boolean) objects[0];
		this.MyLocka = objects[1];
		this.MyLockb = objects[2];
	}
	
	@Override
	public void run() {
		if(flag) {
			while(true) {
				synchronized(this.MyLocka) {
					System.out.println("if........locka");
					synchronized(this.MyLockb) {
						System.out.println("if........lockb");
					}
				}
			}
			
			
		}else {
			while(true) {
				synchronized(this.MyLockb) {
					System.out.println("else........lockb");
					synchronized(this.MyLocka) {
						System.out.println("else........locka");
					}
				}
			}			
		}
	}
}

