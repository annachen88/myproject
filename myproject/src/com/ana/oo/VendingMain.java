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
			//先讀取資料加入Drink
			FileReader read = new FileReader("Vending.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			String[] taken = line.split(",");
			int count = Integer.parseInt(taken[0]);
			for (int i = 0; i < Integer.parseInt(taken[0]); i++) {
				String name = taken[i * 2 + 1];
				int price = Integer.parseInt(taken[i * 2 + 2]);
			vm.drinks.add(new Drink(i + 1, name, price));
				// for (int i = 1; i <= Integer.parseInt(taken[0]); i++) {
				// System.out.println(i+" "+taken[1*i]+" "+taken[2*i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		//使用方法
		vm.on();
	}

}
