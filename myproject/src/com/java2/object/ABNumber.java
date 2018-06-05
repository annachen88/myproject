package com.java2.object;

import java.util.Scanner;

public class ABNumber {

	public ABNumber() {

	}

	String number;

	public ABNumber(String number) {
		this.number = number;
	}

	Scanner scanner = new Scanner(System.in);
	int result = 0;

	public int validate(String secret) {
		String number = scanner.nextLine();
		int length = secret.length();
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == secret.charAt(j)) {
					if (i == j) {
						result = result + 10;
					} else {
						result = result + 1;
					}
					break;

				}
			}
		}
		return result;
	}

}
