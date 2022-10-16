package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("chiru", 700);
		map.put("balu", 800);
		map.put("venkey", 900);
		map.put("nag", 500);
		System.out.println(map);
		
		System.out.println(map.put("chiru", 1000));// returns old value
		
		Set s = map.keySet();
		System.out.println(s);// all keys to set
		
		Collection l = map.values();
		System.out.println(l);
		
		Set s1 = map.entrySet();
		System.out.println(s1);// entry set means [k=v,k=v....]
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "..."+ m1.getValue());
			if(m1.getKey().equals("chiru"))
				m1.setValue(10000);
		}
		System.out.println(map);
	}

}
