package com.java2.object;

public class Restaurant {
	protected int salary=5000;
	private float bonus = 0.1f;
	
	public float getbonus() {
		return this.bonus;
	}
	
	public void setbonus(float bonus) {
		this.bonus = bonus;
	}
	
	public Restaurant(int salary) {
		this.salary = salary;
	}

	private int calc() {
		return (int) (salary * bonus);
	}
	
	public void print() {
		System.out.println(calc());
	}
}
