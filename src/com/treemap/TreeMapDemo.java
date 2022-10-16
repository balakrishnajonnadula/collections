package com.treemap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tmp = new TreeMap();
		tmp.put(100, "Hello");
		tmp.put(104, "Hi");
		tmp.put(101, "He");
		tmp.put(106, "She");
		System.out.println(tmp);// natural sorting order..!
//		tmp.put("Hello", "this");// we get ClassCastException.
//		tmp.put(null, "run"); // we get NullPointerException.
		System.out.println(tmp);
	}

}
