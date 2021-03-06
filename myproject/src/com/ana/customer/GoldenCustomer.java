package com.ana.customer;

public class GoldenCustomer extends SliverCustomer {

	public GoldenCustomer(int amount) {
		super(amount);
		int returnMoney = (int) (amount * discount);
	}

	@Override
	public void print() {
		int total = (int) (amount * (1 - discount));
		int returnMoney = (int) (amount * discount);
		System.out.println("原價:" + amount + "	" + "打折後:" + total + "還原金:" + returnMoney);
	}
}