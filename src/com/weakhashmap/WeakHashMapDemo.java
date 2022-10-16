package com.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;


public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap map = new WeakHashMap();
		Temp temp = new Temp();
		map.put(temp, "jbk");
		System.out.println(map);
		temp = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(map);
	}

}
