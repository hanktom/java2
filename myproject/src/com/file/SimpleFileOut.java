package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileOut {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("data.txt");
		out.write("ABC");
		out.flush();
		out.close();
	}

}
