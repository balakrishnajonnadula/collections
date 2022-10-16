package com.program1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDamo {
	Scanner scanner = new Scanner(System.in);
	List<ProductEntity> pList = new ArrayList<ProductEntity>();

	public void addProduct() {
		System.out.println("Enter id ");
		int id = scanner.nextInt();
		System.out.println("Enter name ");
		String name = scanner.next();
		System.out.println("Enter Qty ");
		int qty = scanner.nextInt();
		System.out.println("Enter price ");
		double price = scanner.nextDouble();
		ProductEntity pEntity = new ProductEntity(id, name, qty, price);
		pList.add(pEntity);
		System.out.println(name + " successfully added..!");
	}

	public void getProductDetails(int id) {
		if (pList != null) {
			for (ProductEntity product : pList) {
				if (product.getId() == id) {
					System.out.println("id : " + product.getId() + ", name : " + product.getName() + ", Qty : "
							+ product.getQty() + ", price : " + product.getPrice());
				}
			}
		} else {
			System.out.println("Source not found...!");
		}
	}
}
