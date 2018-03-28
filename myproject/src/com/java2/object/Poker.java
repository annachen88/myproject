package com.java2.object;

import java.util.Random;

public class Poker {
	Random random = new Random();
	// 洗牌
	String design;
	int[] cards = new int[52];

	public Poker() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
			System.out.println((cards[i] % 13 + 1) + "" + design.charAt(i / 13));
		}

	}

	public void change() {
		for (int i = 0; i < design.length(); i++) {
			int r = random.nextInt(52);
			int tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}

	public void show() {
		for (int i = 0; i < cards.length; i++) {
			int c = cards[i];
			System.out.print((c % 13) + 1 + "" + (design.charAt(c / 13)) + " ");
			if (i % 13 == 0) {
				System.out.println();
			}
		}
	}
}
