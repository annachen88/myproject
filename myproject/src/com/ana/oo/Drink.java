package com.ana.oo;

public class Drink {
	// 包含飲料 id,name,price
	// 製作建構子和方法
	int id;
	String name;
	int price;

	public Drink(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
