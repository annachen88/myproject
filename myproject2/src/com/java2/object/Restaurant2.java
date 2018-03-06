package com.java2.object;

public class Restaurant2 extends Restaurant {

	public Restaurant2(int salary) {
		super(salary);
		super.bonus = 0.1f;
	}

	private void boss() {
		int year = (int) (2*(salary * bonus));
	}
}
