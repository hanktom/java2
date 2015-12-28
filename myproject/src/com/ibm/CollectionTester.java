package com.ibm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTester {

	public static void main(String[] args) {
//		bag1();
//		bagGeneric();
		HashSet<Integer> set = new HashSet<>();
		set.add(96);
		set.add(31);
		set.add(75);
		set.add(10);
		set.add(31);
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		int sum = 0;
		while(it.hasNext()){
			int n = it.next();
			sum = sum + n;
		}
		System.out.println(sum);
	}

	private static void bagGeneric() {
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
		System.out.println(bag);
	}

}


