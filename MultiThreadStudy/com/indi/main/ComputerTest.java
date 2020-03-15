package com.indi.main;

import com.indi.executor.Computer;
import com.indi.task.ComputerInputer;
import com.indi.task.ComputerOutputer;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		ComputerInputer ci = new ComputerInputer(computer);
		ComputerOutputer co = new ComputerOutputer(computer);
		
		Thread t1 = new Thread(ci);
		Thread t2 = new Thread(co);
		
		t1.start();
		t2.start();
	}

}
