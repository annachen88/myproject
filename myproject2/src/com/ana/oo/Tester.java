package com.ana.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu = new Student(55, 66, 77);
		Student student = new Student("Justin");
		// 屬性 繼承
		/*
		 * stu.english = 55; stu.math = 66; stu.chinese = 77;
		 */
		stu.print();

		int avg = stu.getAverge();
		System.out.println("Justin's average:" + avg);
	}

}