package com.kao;

public class NineLazy {

	public NineLazy() {
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {

				if (i < 9 && i > 3) {
					System.out.print("..." + "	");
				} else {
					System.out.print(j + "*" + i + "=" + (i * j) + "	");
				}

			}
			System.out.println();
		}
	}

}
