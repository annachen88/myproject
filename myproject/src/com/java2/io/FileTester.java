package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		
			try {
				FileOutputStream out =new FileOutputStream("data.txt");
				out.write(50);
				out.write(48);
				out.write(49);
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error");
			} catch (IOException e) {
				System.out.println("Error");
			}
		
	}

}
