package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
=======
>>>>>>> a70cb20e1c32390b520c738413ad04e21f60874a

/* 有一文字檔儲存了課表資料(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * 【有空檔】
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * 【有課: C004 English 到 16時 】
 */

public class ScheduleMain {

	public static void main(String[] args) {
		try {
			FileReader read = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
<<<<<<< HEAD
			String[] line1 = line.split(",");
			
			
=======
			String[] line2 = line.split(",");
>>>>>>> a70cb20e1c32390b520c738413ad04e21f60874a

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

<<<<<<< HEAD
	public void gap () {
		List<Schedule> schedule = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
	}	
	
=======
>>>>>>> a70cb20e1c32390b520c738413ad04e21f60874a
}
