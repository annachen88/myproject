package com.java2.object;

public class Restaurant {
	protected int salary;
	protected float bonus = 0.1f;

	public Restaurant(int salary) {
		this.salary = salary;
	}

	private void print() {
		int year = (int) (salary * bonus);
	}
}
