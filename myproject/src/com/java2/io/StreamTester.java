package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StreamTester {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data.txt");
		out.print("Ana");
		out.flush();
		out.close();
		
	}

}
