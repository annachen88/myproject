package myproject;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int a = 1;
		while (a <= i) {
			System.out.print(a + " ");
			a++;
		}
	}

}
