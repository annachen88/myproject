package com.ana.oo;

public class Student {
	// 繼承 屬性(類別裡面的第一層field)
	int english;
	int math;
	int chinese;

		public void print(){
		System.out.println(english+"\t"+
		math+"\t"+chinese);	
			//設計一個方法
		}
		public Student(int e,int m,int c)
		{english =e;
		math =m;
		chinese =c;
			//建構子
			
		}
		public int getAverge(){
			//要回傳
			return(english+math+chinese)/3;
		}
}