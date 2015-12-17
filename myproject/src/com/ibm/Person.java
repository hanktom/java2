package com.ibm;

import java.util.Scanner;

import com.tom.Student;

public class Person {
	String name;
	float weight;
	float height;
	public Person(float weight, float height){
		this.weight = weight;
		this.height = height;
	}

	public Person(){
		
	}
	public Person(String name){
		this.name = name;
	}
	
	public String advice(){
		float bmi = bmi();
		String msg;
		if (bmi>=16 && bmi<=25){
			msg = "正常";
		}else{
			if (bmi<16){
				msg = "多吃一點";
			}else{
				msg = "少吃一點";
			}
		}
		return msg;
	}
	
	public float bmi(){
		float bmi = weight/(height*height);
		bmi = ((int)(bmi*100))/100.0f ;
		return bmi;
	}
	
	public float bmi(float weight, float height){
		float bmi = weight/(height*height);
		bmi = ((int)(bmi*100))/100.0f ;
		return bmi;
	}
	
	public void sayHello(){
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		Lottery539 lot = new Lottery539();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入體重:");
		float w = scanner.nextFloat();
		System.out.print("請輸入身高:");
		float h = scanner.nextFloat();
		Person p = new Person(w, h);
		System.out.println(p.bmi());
		
		int n = 5;
		int m = 7;
		if (n>m){
			System.out.println(n);
		}else{
			System.out.println(m);
		}
		System.out.println((n>m)? n: m);
		
		System.out.println(3+(n++));
		
		System.out.println(n);
		
//		Person p = new Person(45.5f, 1.7f);
//		p.sayHello();
//		p.weight = 65.5f;
//		p.height = 1.7f;
		
//		System.out.println(p.advice());
		
		float f = 10;
		float f2 = (float)10.5;
		System.out.println("abc"+f);
		
		
	}
	
	
}
