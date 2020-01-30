package com.Ani.Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList cities = new ArrayList<>();
		cities.add("Bangalore");
		cities.add("Punjab");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Bangalore");
		
		System.out.println(cities.size());
		System.out.println(cities);
	}

}
