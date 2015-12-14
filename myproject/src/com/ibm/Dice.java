package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[4];
		for (int t = 0; t < 10; t++) {
			for (int i = 0; i < 4; i++) {
				n[i] = r.nextInt(6) + 1;
				System.out.print(n[i] + " ");
			}
			System.out.println();
		}
	}
}