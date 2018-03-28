package com.java2.object;

public class Restaurant {

	public int salary;
	public float bonus = 0.1f;

	public Restaurant(int salary) {
		this.salary = salary;
	}

	private void print() {
		int year = (int) (salary * bonus);
	}

 

}
