package com.java2.object;

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	String design ;
	ArrayList<Integer> card = new ArrayList<>();

	public Poker2() {

		for (int i = 0; i < card.size(); i++) {
			card.add(i);
			System.out.println((card.get(i) % 13 + 1) + "" + design.charAt(i / 13));
		}
	}

	public void change() {
		for (int i = 0; i < design.length(); i++) {
			int r = random.nextInt(52);
			card.set(i, card.get(r));
		}
	}
	
	public void show() {
		for (int i = 0; i < card.size(); i++) {
			System.out.println((card.get(i) % 13 + 1) + "" + design.charAt(i / 13));
			if (i % 13 == 0) {
				System.out.println();
			}
	
	
	
}}}