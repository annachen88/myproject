package com.ana.oo;

public class Student {
	// 繼承 屬性(類別裡面的第一層field)
	int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;

		public void print(){
		System.out.println(english+"\t"+
		math+"\t"+chinese);	
			//設計一個方法
		}
		public Student() {
		}
		//空建構子
		public Student(int english,int math,int chinese)
		{this.english =english;
		this.math =math;
		this.chinese =chinese;
			//建構子（不用加回傳值）
	//this 
			
		}
		public int getAverge(){
			//要回傳（有void不用return）
			return(english+math+chinese)/3;
		}
		//方法 
}