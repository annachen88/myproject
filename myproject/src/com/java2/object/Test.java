package com.java2.object;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Restaurant res = new Restaurant(2000);
		res.setbonus(.2f);
		res.print();
		Restaurant2 res2 = new Restaurant2(3000);
		res2.setbonus(.3f);
		res2.print();
	}

}
