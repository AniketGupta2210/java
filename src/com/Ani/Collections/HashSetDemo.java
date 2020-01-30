package com.Ani.Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		
		HashSet hset= new HashSet() ;
		hset.add("Bangalore");
		hset.add("Punjab");
		hset.add("Delhi");
		hset.add("Mumbai");
		hset.add("Bangalore");
		
		System.out.println(hset.size());
		System.out.println(hset);
	}

}
