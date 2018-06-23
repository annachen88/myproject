package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
class Schedule {
	private String courseNumber;
	String course;
	int week;
	int time;
	int hour;

	public Schedule(String courseNumber, String course, int week, int time, int hour) {
		this.courseNumber = courseNumber;
		this.course = course;
		this.week = week;
		this.time = time;
		this.hour = hour;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
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

public class ScheduleMain {
	static List<Schedule> scheduleList = new ArrayList<>();

	public static void main(String[] args) {

		try {
			FileReader read = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			while (line != null) {
				String[] line1 = line.split(",");
				scheduleList.add(new Schedule(line1[0], line1[1], Integer.parseInt(line1[2]),
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
//		Iterator itr = scheduleList.iterator();
//		while (itr.hasNext()) {
//			Schedule str = (Schedule) itr.next();
//			System.out.println(str.getCourseNumber() + "  " + str.course);
//		}
		gap();
	}

	public static void gap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
		int read1 = scanner.nextInt();
		System.out.println(" 請輸入時(0-24):");
		int read2 = scanner.nextInt();
		int i = 0;
		boolean week = true;
		while (week&&i<scheduleList.size()) {
			if (read1 == scheduleList.get(i).getWeek()) {
			
				if (read2 < scheduleList.get(i).getTime() + scheduleList.get(i).getHour()
						&& read2 >= scheduleList.get(i).getTime()) {
					System.out.println("No ");
					week = false;
				} else
					i++;
			} else
				i++;
		}
		if (week == true) System.out.println("Yes  "); 

	}
}
