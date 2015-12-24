package com.parking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParkingLot {
	int rate = 30;
	Car[] cars = new Car[50];
	
	public void enter(Car c){
		
	}
	
	
	public static void main(String[] args) {
//		ng();
		ParkingLot lot = new ParkingLot();
		try {
			FileReader fr = new FileReader("parking-data.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null){
				System.out.println(line);
				String[] s = line.split(",");
//				System.out.println(s.length);
//				System.out.println(s[0]);
//				System.out.println(s[1]);
				Calendar now = Calendar.getInstance();
				System.out.println(now);
				
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private static void ng() {
		Scanner scanner = new Scanner(System.in);
		ParkingLot lot = new ParkingLot();
		System.out.print("請輸入時間:");
		String time = scanner.nextLine();
		System.out.print("請輸入車牌:");
		String id = scanner.nextLine();
		Car c1 = new Car(id, time);
	}
	
}
