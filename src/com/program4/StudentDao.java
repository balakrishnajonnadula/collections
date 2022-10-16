package com.program4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.program4.Student;

public class StudentDao {
	Scanner scanner = new Scanner(System.in);
	List<Student> std = new ArrayList<Student>();

	public void addStudents() {
		System.out.println("student id :");
		int id = scanner.nextInt();
		System.out.println("student name :");
		String name = scanner.next();
		System.out.println("student add :");
		String add = scanner.next();
		Student student = new Student(id, name, add);
		std.add(student);
		System.out.println(name + " added successfully..!");
	}

	public void viewStudents(int index) throws StudentException {
		if (std != null) {
			if(index <= std.size()-1) {
				Student student = std.get(index);
				System.out.println(
						"Id : " + student.getId() + ", Name  : " + student.getName() + ", Address : " + student.getAdd());				
			}else {
				throw new StudentException("StudentNotFoundAtGivenIndex");
			}
		} else {
			throw new StudentException("StudentIndexNotFound");
		}
	}
}
