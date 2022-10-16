package com.identityhashmap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap iMap = new IdentityHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		iMap.put(i1, 1000);
		iMap.put(i2, 2000);
		System.out.println(iMap);
		
	}

}
