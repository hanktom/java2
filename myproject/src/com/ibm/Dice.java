package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[4];
		boolean allSix = false;
		int time= 0;
		while(!allSix ){
			time++;
			int sum = 0;
			for (int i = 0; i < 4; i++) {
				n[i] = r.nextInt(6) + 1;
				System.out.print(n[i] + " ");
				sum=sum+n[i];
			}
			System.out.println();
			if (sum==24){
				allSix = true;
				System.out.println(time);
			}
		}
		
	}
}