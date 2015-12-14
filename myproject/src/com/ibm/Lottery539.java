package com.ibm;

import java.util.Random;

public class Lottery539 {
	int[] nums = new int[5];
	
	public void generate(){
		Random r = new Random();
		for (int i=0; i<5; i++){
			int n = r.nextInt(39)+1;
			nums[i]=n;
		}
	}
	
	public void print(){
		for (int i=0;i <5; i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Lottery539 lot = new Lottery539();
		lot.generate();
		lot.print();
	}

}
