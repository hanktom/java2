package com.thread;

public class Racing {

	public static void main(String[] args) throws InterruptedException {
		Horse h1 = new Horse();
		Horse h2 = new Horse();
		h1.start();
		h2.start();
		h1.join();
		h2.join();
		System.out.println("Main結束");
	}

}

