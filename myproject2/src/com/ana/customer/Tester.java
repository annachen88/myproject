package com.ana.customer;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(99);
		list.add(100);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.size());
		int n = list.get(0);
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
		/*
		 * Customer c1 = new Customer(1000); c1.print(); SliverCustomer c2 = new
		 * SliverCustomer(1000); c2.print(); GoldenCustomer c3 =new
		 * GoldenCustomer(1000); c3.print();
		 */

		ArrayList<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer(1000);
		SliverCustomer c2 = new SliverCustomer(1000);
		GoldenCustomer c3 = new GoldenCustomer(1000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();

		}
	}

}
