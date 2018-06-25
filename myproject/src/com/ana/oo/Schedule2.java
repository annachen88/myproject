package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Schedule3 {
	String className;
	String number;
	int week;
	int time;
	int hour;

	public Schedule3(String className, String number, int week, int time, int hour) {
		super();
		this.className = className;
		this.number = number;
		this.week = week;
		this.time = time;
		this.hour = hour;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

}

public class Schedule2 {
	static List<Schedule3> information = new ArrayList<>();

	public static void main(String[] args) {
		try {
			FileReader read = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			while (line != null) {
				String[] line1 = line.split(",");
				information.add(new Schedule3(line1[0], line1[1], Integer.parseInt(line1[2]),
						Integer.parseInt(line1[3]), Integer.parseInt(line1[4])));
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
gap();
	}

	public static void gap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
		int read1 = scanner.nextInt();
		System.out.println(" 請輸入時(0-24):");
		int read2 = scanner.nextInt();
		int i = 0;
		while (i < information.size()) {
			if (read1 != information.get(i).getWeek()) {
				System.out.println("【有空檔】");
				break;
			} else {
				if (read2 == information.get(i).getTime()
						&& read2 <= (information.get(i).getTime() + information.get(i).getHour())) {
					System.out.println("【有課:" + information.get(i).getClassName() +" " +information.get(i).getNumber() + "到"
							+ (information.get(i).getTime() + information.get(i).getHour()) + "時 】");
					break;}
				
			}
			i++;
		}
	};

}
