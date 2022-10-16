package com.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap lMap = new LinkedHashMap<>();
		lMap.put("chiru", 700);
		lMap.put("balu", 500);
		lMap.put("ravi", 400);
		lMap.put("sam", 600);
		// insertion order is preserved this is the small change reaming everything is same
		System.out.println(lMap);
	}

}
