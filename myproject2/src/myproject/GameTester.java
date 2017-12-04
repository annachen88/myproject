package myproject;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		System.out.print("Please enter the number:");
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			int i = scanner.nextInt();

			switch (i) {
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 0:
				break;
			}
			if (i == 0) {
				break;
			}
		}
	}

}
