package com.ibm;

public class Person {
	float weight;
	float height;
	public Person(float weight, float height){
		this.weight = weight;
		this.height = height;
	}
	
	public float bmi(){
		float bmi = weight/(height*height);
		bmi = ((int)(bmi*100))/100.0f ;
		return bmi;
	}
	
	public void sayHello(){
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		Person p = new Person(65.5f, 1.7f);
		p.sayHello();
//		p.weight = 65.5f;
//		p.height = 1.7f;
		System.out.println(p.bmi());
		
	}
}
