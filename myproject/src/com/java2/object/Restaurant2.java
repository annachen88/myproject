package com.java2.object;

public class Restaurant2 extends Restaurant {
	private float bonus;
	int year;
	public Restaurant2(int salary) {
		super(salary);
		bonus = getbonus();
	}
	public float getbonus() {
		return this.bonus;
	}
	
	public void setbonus(float bonus) {
		this.bonus = bonus;
	}
	
	private void calc() {
		year = (int) (2*(salary * bonus));
	}
	
	public void print() {
		calc();
		System.out.println(year);
	}
}
