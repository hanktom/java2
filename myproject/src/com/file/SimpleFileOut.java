package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileOut {

	public static void main(String[] args) throws IOException {
//		writeFile();
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