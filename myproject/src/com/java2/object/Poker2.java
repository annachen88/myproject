package com.java2.object;

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	String design = "SHDC";
	ArrayList<String> card = new ArrayList<>();

	public Poker2() {

		for (int i = 0; i < 52; i++) {
			String s = Integer.toString(i%13+1) + design.charAt(i/13);
			card.add(s);
			System.out.println(card.get(i) );
		}
	}

	public void change() {
		
		for (int i = 0; i < card.size(); i++) {
			String s = card.get(i);
			int r = random.nextInt(52);
			card.set(i, card.get(r));
			card.set(r, s);
		}
	}
	
	public void show() {
		for (int i = 0; i < card.size(); i++) {
			System.out.print(card.get(i)+" ");
			if ((i+1) % 13 == 0) {
				System.out.println();
			}
	
	
	
}}}