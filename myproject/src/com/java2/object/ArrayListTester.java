package com.java2.object;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTester {

	public static void main(String[] args) {
		ArrayList<Integer> card = new ArrayList<>();
		List<Integer> cards =new ArrayList<>();//父類別=子物件 
		cards.add(10);
		cards.add(12);
		card.add(25);
		cards.remove(0);
		System.out.println(cards.size());
		System.out.println(card.get(0));
		System.out.println(cards.get(0));
		System.out.println();
	}

}
