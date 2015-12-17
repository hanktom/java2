package com.tom;

public class GraduateStudent extends Student{

	int thesis;
	static int pass=70;
	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english);
		this.thesis = thesis;
	}
	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
	
	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage());
		if (getAverage()<pass)
			System.out.print("*");
		System.out.println("\t"+thesis+((thesis<70) ? "*" : ""));
	}
	
}



