package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public ABGame() {
	}

	public static void main(String[] args) {
		String secret = "9873";
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		while (a != 4) {
			boolean found = false;
			a = 0;
			b = 0;
			System.out.print("Please enter your guess:");
			String number = scanner.nextLine();
			for (int i = 0; i < number.length() - 1; i++) {
				for (int j = i + 1; j < number.length(); j++) {
					if (number.charAt(i) == number.charAt(j)) {
						found = true;
						break;
					}
				}
			}
			if (!found) {
				for (int i = 0; i < number.length(); i++) {
					for (int j = 0; j < secret.length(); j++) {
						if (number.charAt(i) == secret.charAt(j)) {
							if (i == j) {
								a++;
							} else {
								b++;
							}
							break;
						}
					}
				}
				if(a==4)System.out.println("****** WIN *******");
				else System.out.println(a + "A" + b + "B");
	
			}
			else System.out.println("Don't duplicate the numbers!!!");
		}
	}
}