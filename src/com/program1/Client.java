package com.program1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		ArrayListDamo aDamo = new ArrayListDamo();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1) add product ");
			System.out.println("2) check product ");
			System.out.println("3) exit ");
			switch (scanner.nextInt()) {
			case 1: {
				aDamo.addProduct();
				break;
			}
			case 2: {
				System.out.println("Enter product Id");
				aDamo.getProductDetails(scanner.nextInt());
				break;
			}
			case 3: {
				System.out.println("Thank you for using product application : ");
				System.exit(0);
			}
			}
		}
	}

}
