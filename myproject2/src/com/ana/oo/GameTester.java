package com.ana.oo;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
<<<<<<< HEAD

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
			if (position / COLUM < ROW - 1) {
				position = position + COLUM;

				hp = hp - 5;

				// 下
			} else {
				hp = hp - 30;
				bool = false;
				break;
			}break;
		case 8:

			if (position / COLUM < ROW + 1) {
				position = position - COLUM;
				// 上
				hp = hp - 5;
			} else {
				hp = hp - 30;
				bool = false;
				break;
			}break;

		case 4:
			if (position % COLUM != 0) {
				position = position - 1;
				// 左
				hp = hp - 5;
			} else {
				hp = hp - 30;
				bool = false;
				break;
			}break;

		case 6:
			if (position % COLUM != COLUM-1) {
				position = position +1;
				// 右
				hp = hp - 5;
			} else {
				hp = hp - 30;
				bool = false;
				break;
			}break;
		default:
			break;
		}
		}
=======
		System.out.println("請輸入方向");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int hp = 100;
		int position = 0;
		int colum = 5;
		int row = 3;
		while (hp >= 0)
			switch (i) {
			case 2:
				if (position / colum < row - 1) {
					position = position + colum;
					System.out.println("你的位置:" + position);
					// 下
					hp = hp - 5;
					System.out.println("生命值" + hp);
					
				} else {
					hp = hp - 30;
					System.out.println("生命值" + hp);
					
				}break;
			case 8:
				if (position / colum > row + 1) {
					position = position - colum;
					System.out.println("你的位置:" + position);
					// 上
					hp = hp - 5;
					System.out.println("生命值" + hp);
					
				} else {
					hp = hp - 30;
					System.out.println("生命值" + hp);
					
				}break;

			case 4:
				if (position%colum!=0) {
					position = position - 1;
					System.out.println("你的位置:" + position);
					// 左
					hp = hp - 5;
					System.out.println("生命值" + hp);
					
				} else {
					hp = hp - 30;
					System.out.println("生命值" + hp);
					
				}break;

			case 6:
				if (position%colum!=0) {
					position = position +1;
					System.out.println("你的位置:" + position);
					// 右
					hp = hp - 5;
					System.out.println("生命值" + hp);
					
				} else {
					hp = hp - 30;
					System.out.println("生命值" + hp);
					
				}break;

			}
>>>>>>> e250edebb4301b98402ddff6a4a21cd6514dcc13
	}
}
