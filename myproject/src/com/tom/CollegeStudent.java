package com.tom;

public class CollegeStudent extends Student {

	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeStudent(int math, int chinese, int english) {
		super(math, chinese, english);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.print(math+"\t"+chinese+"\t"+getEnglish()+"\t"+getAverage());
		if (getAverage()<pass)
			System.out.println("*");
		else
			System.out.println();
		

	}

}
