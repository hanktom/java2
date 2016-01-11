package com.thread;

public class Raceing2 {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		HorseRunnable h2 = new HorseRunnable();
		h1.start();
		Thread thr = new Thread(h2);
		thr.start();
	}

}
