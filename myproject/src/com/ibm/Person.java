package com.ibm;

public class Person {
	float weight;
	float height;
	public Person(float weight, float height){
		this.weight = weight;
		this.height = height;
	}
	
	public String advice(){
		float bmi = bmi();
		String msg;
		if (bmi<16){
			msg = "多吃點哦";
		}else{
			if (bmi>25){
				msg = "少吃一點哦";
			}else{
				msg = "正常";
			}
		}
		return msg;
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
		System.out.println(6!=3);
		
		Person p = new Person(65.5f, 1.7f);
		p.sayHello();
//		p.weight = 65.5f;
//		p.height = 1.7f;
		
		System.out.println(p.advice());
		
		
	}
	
	
}
