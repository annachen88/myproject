package com.kao;

import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		int left = 0;

		for (;;) {
			System.out.println("販賣機餘額：" + left + "元");
			System.out.println("請投幣或選擇飲料（a或b或c）,或輸入0結束：");
			Scanner scanner = new Scanner(System.in);
			String coin = scanner.nextLine();
			// System.out.println(coin);

			if (coin.equals("1") || coin.equals("5") || coin.equals("10")) {
				left += Integer.parseInt(coin);

			} else {
				if (coin.equals("0"))
					break;
				else
					switch (coin) {
					case "a":

						if (left < 15) {
							System.out.println("BEEP!");
							System.out.println("販賣機餘額：" + left + "元");
							break;
						} else {
							left = left - 15;
							System.out.println("DONE!");
							break;
						}
					case "b":
						if (left < 20) {
							System.out.println("BEEP!");
							System.out.println("販賣機餘額：" + left + "元");
							break;
						} else
							left = left - 20;
						System.out.println("DONE!");
						break;
					case "c":
						if (left < 30) {
							System.out.println("BEEP!");
							System.out.println("販賣機餘額：" + left + "元");
							break;
						} else
							left = left - 30;
						System.out.println("DONE!");
						break;
					default:
						break;

					}
			}
		}
	}
}

/*
 * if (coin.equals("a")) { if (left < 15) { System.out.println("BEEP!");
 * System.out.println("販賣機餘額：" + left + "元"); } else { left = left - 15;
 * System.out.println("DONE!"); } } else { if (coin.equals("b")) { if (left <
 * 20) { System.out.println("BEEP!"); System.out.println("販賣機餘額：" + left + "元");
 * } else left = left - 20; System.out.println("DONE!"); } else { if
 * (coin.equals("c")) { if (left < 30) { System.out.println("BEEP!");
 * System.out.println("販賣機餘額：" + left + "元"); } else left = left - 30;
 * System.out.println("DONE!"); } else { if (coin.equals("0")) { break; } }
 * 
 * } } }
 */
