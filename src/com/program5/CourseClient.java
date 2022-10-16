package com.program5;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.program4.StudentDao;
import com.program4.StudentException;

public class CourseClient {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CourseDao std = new CourseDao();
		while (true) {
			System.out.println("1)add course");
			System.out.println("2)Remove course");
			switch (scanner.nextInt()) {
			case 1: {
				std.addCourse();
				break;
			}
			case 2: {
				System.out.println("Enter course");
				std.removeCourse(scanner.next());
				break;
			}
			default: {
				System.out.println("Enter valid input..!");
			}
			}
		}
	}
}
