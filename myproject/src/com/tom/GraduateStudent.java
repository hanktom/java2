package com.tom;

public class GraduateStudent extends Student{
	int thesis;
	static int pass = 70;
	
	public GraduateStudent(int math, int chinese, int english) {
		super(math, chinese, english);
		thesis = 0;
	}
	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english);
		this.thesis = thesis;
	}
}
