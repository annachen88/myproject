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
			String[] taken = line.split(",");
			for (int i = 1; i <taken.length; i++) {
				System.out.println(i+"	"+taken[1*i]+"	"+taken[2*i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
