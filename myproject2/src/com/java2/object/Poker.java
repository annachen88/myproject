package com.java2.object;

public class Poker {

	public static void main(String[] args) {
		int n[] = new int[52];
		String a = "SHDC";
		for (int i = 0; i < n.length; i++) {
			System.out.println((i % 13) + 1 + "" + a.charAt(i / 13));
		}

	}

}
