package com.ana.oo;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
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
	}
}
