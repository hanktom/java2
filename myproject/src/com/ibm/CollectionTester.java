package com.ibm;

import java.util.ArrayList;

public class CollectionTester {

	public static void main(String[] args) {
//		bag1();
		ArrayList<String> bag = new ArrayList<>();
		bag.add("abc");
		bag.add("xyz");
		String s1 = bag.get(0);
		System.out.println(s1);
		System.out.println(bag.get(1));
	}

	private static void bag1() {
		ArrayList bag = new ArrayList();
		bag.add("abc");
		bag.add(5);
		bag.add(3.6);
		bag.add("xyz");
		System.out.println(bag.get(1));
		String s1 = (String)bag.get(0);
		System.out.println(s1);
	}

}

