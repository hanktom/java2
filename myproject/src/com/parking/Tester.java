package com.parking;

import java.util.Date;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		String[] cars = new String[50];
		String[] times = new String[50];
		int pos = 0;
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("請輸入時間:");
			String time = scanner.nextLine();
			System.out.print("請輸入車牌:");
			String plate = scanner.nextLine();
			for (int i=0;i<=pos;i++){
				if (plate.equals(cars[i])){
					
				}
			}
			cars[pos] = plate;
			times[pos] = time;
			pos++;
		}

	}

}
