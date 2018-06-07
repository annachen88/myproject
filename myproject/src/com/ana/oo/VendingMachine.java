package com.ana.oo;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//製作一個on方法讓使用者輸入
public class VendingMachine {
	int coin = 0;
	List<Drink> drinks = new ArrayList<>();
	public void on() {
		System.out.println("Please insert the coins !");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		coin=coin+number;
		

	}
	// List<Drink> drinks = new ArrayList<>();

}
