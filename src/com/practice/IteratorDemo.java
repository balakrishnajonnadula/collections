package com.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {
//		it is universal iterator help to retrieve the object one by one fashion.
//		it is use full to remove and read the objects
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		System.out.println(ll);
		Iterator iterator = ll.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}

}
