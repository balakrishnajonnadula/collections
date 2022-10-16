package com.practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList<>();
		// add() is usefull to add object if object add successfully it returns true
		// else false
		System.out.println(aList.add("A"));// true
		aList.add("B");
		aList.add("C");
		aList.add("D");
		System.out.println(aList);

		ArrayList aList2 = new ArrayList<>();
//		addAll() is add specified collection to current collection and returns true else false.
		System.out.println(aList2.addAll(aList));// true
		System.out.println(aList2);

//		remove() is useful to remove object if it removes true else returns false
		System.out.println(aList.remove("B"));// true
		System.out.println(aList);
		aList.remove(1);
		System.out.println(aList);

		ArrayList aList3 = new ArrayList();
		aList3.add("A");
		aList3.add("B");
		aList3.add("C");
		aList3.add("D");
		aList3.add("E");
		aList3.add("F");
		ArrayList aList4 = new ArrayList<>();
		aList4.add("B");
		aList4.add("C");
		aList4.add("D");
		System.out.println(aList3);
		System.out.println(aList4);
//		removeAll() method is useful to remove the same elements present in specified array. 
		System.out.println(aList3.removeAll(aList4));
		System.out.println(aList3);

//		contains() is useful to check the objects is present or not if present returns true else false
//		containsAll() is useful to check all objects are present or not if present returns true else false

//		size() is returns size of List.
//		isEmpty() is returns boolean if object is present returns true else false.
//		toArray() which helps to return all collection objects to Object[].

	}

}
