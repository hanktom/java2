package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileOut {

	public static void main(String[] args)  {
		// writeFile();
		 readFile();
//		scoring();
//		divideByZero();

		try {
			for (int i = 0; i < args.length; i++) {
				FileReader fr = new FileReader("data.txt");
				BufferedReader in = new BufferedReader(fr);
				String line = in.readLine();
				while (line != null) {
					System.out.println(line);
					line = in.readLine();
				} 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void divideByZero() {
		try {
			int n = 5 / 3;
		} catch (ArithmeticException e) {
			System.out.println("分母不得為零");
		}
	}

	private static void scoring() {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("請輸入成績:");
			String s = scanner.nextLine();
			try {
				int score = Integer.parseInt(s);
				sum = sum + score;
				System.out.println("Total:" + sum);
			} catch (NumberFormatException e) {
				System.out.println("格式錯誤,請重新輸入");
			}
		}
	}

	private static void readFile() {
		try {
			FileReader in = new FileReader("data.txt");
			int d = in.read();
			while (d != -1) {
				System.out.println((char) d);
				d = in.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeFile() throws IOException {
		FileWriter out = new FileWriter("data.txt");
		out.write("ABC");
		out.flush();
		out.close();
	}

}
