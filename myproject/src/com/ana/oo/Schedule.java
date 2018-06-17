package com.ana.oo;


public class Schedule {
String courseNumber;
String course;
int week;
int time;
int hour;

	
	public Schedule(String courseNumber, String course, int week, int time, int hour) {
		this.courseNumber=courseNumber;
		this.course=course;
		this.week=week;
		this.time=time;
		this.hour=hour;
	}


	public String getCourseNumber() {
		return courseNumber;
	}


	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}


	public String getCourse() {
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
