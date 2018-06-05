package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {
		List<Drink> drinks = new ArrayList<>();
		VendingMachine vm = new VendingMachine(); 
		
		
		
		try {
			FileReader read = new FileReader("Vending.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
