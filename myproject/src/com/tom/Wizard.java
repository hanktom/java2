package com.tom;

public class Wizard extends Player {

	@Override
	public void attack() {
		System.out.println(
		"使出定身術,週圍無法動彈三回合");
	}

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Integer i = new Integer(100);
		int n = i;
		int n2 = i.intValue();
		Integer i2 = 100;
		
		String s1 = new String("abc");
		String s2 = new String("abc");
//		String s1 = "abc";
//		String s2 = "abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
//		s1 = "xyz";
		StringBuilder sb = new StringBuilder("abc");
		sb.append("xyz");
		System.out.println(sb);
		
		
		
		
	}
}
