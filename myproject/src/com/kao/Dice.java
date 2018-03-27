package com.kao;

import java.util.Random;

public class Dice {

	public Dice() {
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			Random ran = new Random();
			int n1 = ran.nextInt(6) + 1;
			int n2 = ran.nextInt(6) + 1;
			int n3 = ran.nextInt(6) + 1;
			int n4 = ran.nextInt(6) + 1;
			if (n1 != n2 && n2 != n3 && n3 != n4 && n1 != n3 && n2 != n4 && n1 != n4) {
				System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + "*");
			} else {
				System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
			}

		}
	}

}
