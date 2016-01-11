package com.thread;

public class HorseRunnable implements Runnable{

	@Override
	public void run() {
		for (int i=1; i<=500; i++){
			System.out.println(i);
		}
		
	}

}
