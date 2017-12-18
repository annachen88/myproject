package com.ana.oo;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {

		int hp = 100;
		int position = 0;
		final int COLUM = 5;
		final int ROW = 3;
		boolean bool = true;

		while (bool) {
			System.out.println("目前位置:" + position + " HP:" + hp);
		System.out.print("請輸入方向:");
		Scanner scanner = new Scanner(System.in);
		int direction = scanner.nextInt();
		switch (direction) {
		case 2:
			System.out.println("向下");
			if (position / COLUM < ROW - 1) {
				position = position + COLUM;

				hp = hp - 5;

				// 下
			} else {
				hp = hp - 30;
				bool = false;
				System.out.println("BYE");
				break;
			}break;
		case 8:
			System.out.println("向上");
			if (position / COLUM < ROW + 1) {
				position = position - COLUM;
				// 上
				hp = hp - 5;
			} else {
				hp = hp - 30;
				bool = false;
				System.out.println("BYE");
				break;
			}break;

		case 4:
			System.out.println("向左");
			if (position % COLUM != 0) {
				position = position - 1;
				// 左
				hp = hp - 5;
			} else {
				hp = hp - 30;
				bool = false;
				System.out.println("BYE");
				break;
			}break;

		case 6:
			System.out.println("向");
			if (position % COLUM != COLUM-1) {
				position = position +1;
				// 右
				hp = hp - 5;
			} else {
				hp = hp - 30;
				bool = false;
				System.out.println("BYE");
				break;
			}break;
		default:
			System.out.println("BYE");
			break;
		}
		}
	}
}
