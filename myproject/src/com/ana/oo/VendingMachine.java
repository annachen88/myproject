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
		// 先印出飲料資訊
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		/*
		 * int data = -1; 
		 * while (data != 0) { 
		 * data = scanner.nextInt(); 
		 * switch (data) {
		 * case 0:
		 * break; } }
		 */
		for (;;) {
			System.out.println("Please insert the coins!");
			int number = scanner.nextInt();
			coin = coin + number;
			System.out.println("目前餘額：" + " " + coin);
			if (coin >= 20) {
				System.out.println("是否要選擇飲料？");
				System.out.println("yes:1" + " " + "no:2");
				int choose = scanner.nextInt();
				if (choose == 1) {
					System.out.println("Choose the beverage!");
					int beverage = scanner.nextInt();
					switch (beverage) {
					case 1:
						if (coin < 25) {
							System.out.println("餘額不足!!");
						} else {
							coin = coin - 25;
							System.out.println("Cola Out!!");
						}
						break;
					case 2:
						if (coin < 30) {
							System.out.println("餘額不足!!");
						} else {
							coin = coin - 30;
							System.out.println("Juice Out!!");
						}
						break;
					case 3:
						if (coin < 20) {
							System.out.println("餘額不足!!");
						} else {
							coin = coin - 20;
							System.out.println("Sprite Out!!");
						}
						break;

					}
				}
			}

			if (coin == 0) {
				System.out.println("End!!");
				break;

			}
		}
	}
	// List<Drink> drinks = new ArrayList<>();

}
