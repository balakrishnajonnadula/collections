package com.comparator;

import java.security.Identity;

public class Student {
	private String name;
	private int id;
	private String add;

	public Student() {
		super();
	}

	public Student(String name, int id, String add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + "]";
	}

}
