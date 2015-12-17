package com.tom;

import com.ibm.GraduateStudent;

public class Student {
	public int math;
	public int chinese;
	private int english;
	static int pass = 60;
	public Student(int math, int chinese, int english){
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}
	public Student(){
		
	}
	public Student(int english){
//		this.english = english;
		this(0, 0, english);
	}
	
	protected int getAverage(){
		int avg = (math+chinese+english)/3;
		return avg;
	}
	
	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage());
		if (getAverage()<pass)
			System.out.println("*");
		else
			System.out.println();
	}
	
	public int getEnglish(){
		return english;
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student(60, 44,  70);
		Student stu2 = new Student(35, 77, 66);
		
		Student.pass = 55;
		stu1.print();
		stu2.print();
		stu1.english = -5;
		System.out.println(Math.max(5, 8));
		System.out.println(Math.random());
		int n = Integer.parseInt("5");
		String s = String.valueOf(n);
//		System.out.println(stu.getAverage());
		//研究生
		GraduateStudent gstu = new GraduateStudent(55, 77, 66, 67);
		gstu.print();
	}
}






