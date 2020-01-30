package com.Ani.Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		
		HashMap hmap = new HashMap();
		hmap.put(11,"Aniket");
		hmap.put(22, "Vishal");
		hmap.put(22, "Chaman");
		hmap.put(44, "Rohan");
		hmap.put(33, "Rohan");
		hmap.put(null, "Varun"); //only HashMap excepts null value
		
		System.out.println(hmap.size());
		System.out.println(hmap);
		System.out.println(hmap.get(11));
	}

}
