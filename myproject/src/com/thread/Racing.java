package com.thread;

public class Racing {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		Horse h2 = new Horse();
		h1.start();
		h2.start();
		System.out.println("Main結束");
	}

}

