package com.program5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDao {
	List<Course> courses = new ArrayList<Course>();
	Scanner scanner = new Scanner(System.in);

	public void addCourse() {
		System.out.println("Enter course name : ");
		String course = scanner.next();
		Course core = new Course(course);
		courses.add(core);
		System.out.println(course + " successfully added..!");
	}

	public void removeCourse(String course) {
		if (courses != null) {
			for (Course core : courses) {
				if (core.getCourse().equals(course)) {
					courses.remove(core);
					System.out.println(course + " successfully removed...!");
					break;
				}
			}
		} else {
			System.out.println("Source not found");
		}
	}
}
