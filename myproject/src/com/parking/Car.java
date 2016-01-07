package com.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car{
	SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
	String id;
	public Date enter;
	public Car(String id, Date enter) {
		super();
		this.id = id;
		this.enter = enter;
	}
	public Car(String id, String enterString) {
		this.id = id;
		try {
			Date enter = sdf.parse(enterString); 
			this.enter = enter;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}