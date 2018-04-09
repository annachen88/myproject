package com.java2.object;

import java.util.Random;

public class Poker {
	Random random = new Random();
	// 洗牌
	public String design = "SHDC";
	public String[] cards = new String[52];
	int p;
	

	public Poker() {
		for (int j=0; j<design.length(); j++) {
		for (int i = 0; i < 13; i++) {
			cards[i+13*j] = Integer.toString(i+1) + design.charAt(j);
			System.out.println(cards[i+13*j]);
		}
		}

	}

	public void change() {
		for (int i = 0; i < cards.length; i++) {
			int r = random.nextInt(52);
			String tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}

	public void show() {
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + " ");
			if ((i+1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
