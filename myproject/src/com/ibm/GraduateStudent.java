package com.ibm;

import com.tom.Reporter;
import com.tom.Student;

public class GraduateStudent extends Student implements Reporter{

	int thesis;
	static int pass=70;
	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english);
		this.thesis = thesis;
		Student stu = new Student();
	}
	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
	
	@Override
	public void print() {
		System.out.print(math+"\t"+chinese+"\t"+getEnglish()+"\t"+getAverage());
		if (getAverage()<pass)
			System.out.print("*");
		System.out.println("\t"+thesis+((thesis<70) ? "*" : ""));
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}



