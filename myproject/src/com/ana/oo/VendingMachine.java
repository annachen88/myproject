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
		//先印出飲料資訊
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		/*int data = -1;
		while (data != 0) {
			data = scanner.nextInt();
			switch (data) {
			case 0:
				break;
			}
		}*/
		for (;;) {
			int number = scanner.nextInt();
			coin = coin + number;
			
				/*switch (coin) {
				case 0:
					break;
				

			}*/
		if(coin==0)break;

		}
	}
	// List<Drink> drinks = new ArrayList<>();

}
