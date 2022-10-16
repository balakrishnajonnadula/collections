package com.ass1.program1;

public class Student {
	private int rollNum;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
