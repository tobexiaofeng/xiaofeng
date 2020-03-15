package com.indi.executor;

public class Computer {

	private String name;
	private String profession;
	boolean flag = false;
	
	public synchronized void setInfo(String... strings) {
		if(flag) {
			try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
		}			
		this.name = strings[0];
		this.profession = strings[1];
		this.notify();
		flag = true;
	}

	public synchronized void show() {
		if (!flag) {
			try {this.wait();} catch (InterruptedException e) {	e.printStackTrace();}
		}
		System.out.println(this);
		this.notify();
		flag = false;
	}
	
	@Override
	public String toString() {
		return "Computer [name=" + name + ", profession=" + profession + "]";
	}		
}
