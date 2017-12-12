package com.ana.oo;

public class Student {
	// 繼承 屬性(類別裡面的第一層field)
	int english;
	int math;
	int chinese;
	String name;

	public void print() {
		System.out.println("Justin :" + english + "\t" + math + "\t" + chinese);
		// 設計一個方法
	}

	public Student(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		// 建構子
	}

	public Student(String name) {
		this.name = name;
	}

	// 建構子
	public int getAverge() {
		// 要回傳
		return (english + math + chinese) / 3;
	}
}