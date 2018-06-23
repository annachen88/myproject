package com.ana.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
	String courseNumber;
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
	
	public static void main(String[] args) {
		Course course = new Course();
		
		try {
			FileReader read = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(read);
			String line = in.readLine();
			String[] line1 = line.split(",");
			course.scheduleList.add
			(new Schedule(line1[0], line1[1], Integer.parseInt(line1[2]), Integer.parseInt(line1[3]),Integer.parseInt(line1[4])));
			line = in.readLine();
			String[] line2 = line.split(",");
			course.scheduleList.add
			(new Schedule(line2[0], line2[1], Integer.parseInt(line2[2]), Integer.parseInt(line2[3]),Integer.parseInt(line2[4])));
			line = in.readLine();
			String[] line3 = line.split(",");
			course.scheduleList.add
			(new Schedule(line3[0], line3[1], Integer.parseInt(line3[2]), Integer.parseInt(line3[3]),Integer.parseInt(line3[4])));
			line = in.readLine();
			String[] line4 = line.split(",");
			course.scheduleList.add
			(new Schedule(line4[0], line4[1], Integer.parseInt(line4[2]), Integer.parseInt(line4[3]),Integer.parseInt(line4[4])));


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

	 class Course {

		List<Schedule> scheduleList = new ArrayList<>();

		public void gap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入星期(1-7):");
			int read1 = scanner.nextInt();
			System.out.println(" 請輸入時(0-24):");
			int read2 = scanner.nextInt();
			

		}
	}
