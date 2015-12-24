package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileOut {

	public static void main(String[] args) throws IOException {
//		writeFile();
		FileReader in = new FileReader("data.txt");
		int d = in.read();
		System.out.println((char)d);
		d = in.read();
		System.out.println(d);
		d = in.read();
		System.out.println(d);
		d = in.read();
		System.out.println(d);
		d = in.read();
		System.out.println(d);
		
	}

	private static void writeFile() throws IOException {
		FileWriter out = new FileWriter("data.txt");
		out.write("ABC");
		out.flush();
		out.close();
	}

}
