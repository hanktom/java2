package com.parking;

import java.util.Date;

public class Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.ceil(-1.3));
//		int n = 10;
//		String s = "abc";
		StringBuffer sb = new StringBuffer("abc");
		change(sb);
		System.out.println(sb.toString());
		
		Car c = new Car("123", new Date());
		change(c);
		System.out.println(c.id);
		
		
		int n = 10;
		n = change(n);
		System.out.println(n);
		
	}
	public static int change(int n){
		n = 20;
		return n;
	}
	
	public static void change(Car c){
		c.id = "222";
	}
	public static void change(StringBuffer sb){
//		s = "xyz";
		sb.append("123");
		
	}
	
	
}
