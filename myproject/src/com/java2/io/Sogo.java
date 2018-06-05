package com.java2.io;

import java.util.Scanner;

public class Sogo implements Destroyable{
	Scanner scanner = new Scanner(System.in);

	public Sogo() {
	}

	public void inputSale() {

	}
	public void start() {

		int fucntion = 0;
		while (fucntion != 3) {

			showFuction();
			int function = scanner.nextInt();
			switch (function) {
			case 3:
				return;
			}
		}
	}

	public void showFuction() {

		System.out.println("請輸入(1~3)號碼");
		System.out.println("1)輸入銷售會員等級");
		System.out.println("2)輸入銷售金額");
		System.out.println("3)結束程式");

	}

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}