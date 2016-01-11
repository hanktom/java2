package com.thread;

public class Horse extends Thread{

	@Override
	public void run() {
		for (int i=1; i<=500; i++){
			System.out.println(getName()+":"+i);
		}
		
	}
	
}
