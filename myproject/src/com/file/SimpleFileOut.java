package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileOut {

	public static void main(String[] args) throws IOException {
//		writeFile();
//		readFile();
		FileReader fr = new FileReader("data.txt");
		BufferedReader in = new BufferedReader(fr);
		String line = in.readLine();
		while(line!=null){
			System.out.println(line);
			line = in.readLine();
		}
	}

	private static void readFile() throws FileNotFoundException, IOException {
		FileReader in = new FileReader("data.txt");
		int d = in.read();
		while(d!=-1){
			System.out.println((char)d);
			d = in.read();
		}
	}

	private static void writeFile() throws IOException {
		FileWriter out = new FileWriter("data.txt");
		out.write("ABC");
		out.flush();
		out.close();
	}

}
