package com.indi.task;

public class LazySingelton {
	private static LazySingelton lazy = null;
	private LazySingelton() {
		
	}
	
	public static LazySingelton getInstance() {
		if(lazy == null) {
			synchronized(LazySingelton.class) {
				if(lazy == null) {
					//Thread.sleep(200);
					lazy = new LazySingelton();
				}			
			}
		}	
		return lazy;
		
	}
}
