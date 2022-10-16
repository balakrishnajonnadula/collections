package com.program4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentDao std = new StudentDao();
		while (true) {
			System.out.println("1)add student");
			System.out.println("2)view student");
			switch (scanner.nextInt()) {
			case 1: {
				std.addStudents();
				break;
			}
			case 2: {
				System.out.println("Enter index");
				try {
					std.viewStudents(scanner.nextInt());
				} catch (StudentException | InputMismatchException e) {
					System.out.println(e);
				}
				break;
			}
			default: {
				System.out.println("Enter valid input..!");
			}
			}
		}
	}

}
