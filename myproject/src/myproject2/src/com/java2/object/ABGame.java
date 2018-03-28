package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		int counta = 0;
		int countb = 0;
		int countc = 0;
		String secret = "1356";
		while (counta != 4) {
			counta = 0;
			countb = 0;
			System.out.println("please enter your guess:");
			countc++;
			Scanner scanner = new Scanner(System.in);
			String user = scanner.nextLine();
			int length = secret.length();
			for (int i = 0; i < user.length(); i++) {
				char a = user.charAt(i);
				for (int j = 0; j < secret.length(); j++) {

					if (a == secret.charAt(j)) {
						if (i == j) {
							counta++;
						} else {
							countb++;
						}
					}
				}

			}
			System.out.println(counta + "A" + countb + "B");
		System.out.println("you have guess"+" "+countc+" "+"times");}
	}

}
