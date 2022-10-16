package com.weakhashmap;

import java.util.HashMap;


class Temp {

	@Override
	public String toString() {
		return "temp";
	}

	@Override
	public void finalize() {
		System.out.println("called finalize method..!");
	}

}

public class HashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		HashMap map = new HashMap<>();
		Temp temp = new Temp();
		map.put(temp, "jbk");
		System.out.println(map);
		temp = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(map);
	}

}
