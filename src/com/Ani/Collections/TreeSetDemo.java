package com.Ani.Collections;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		
		TreeSet tset= new TreeSet() ;		//elements are printed in order
		tset.add("Bangalore");
		tset.add("Punjab");
		tset.add("Delhi");
		tset.add("Mumbai");
		tset.add("Bangalore");
		
		System.out.println(tset.size());
		System.out.println(tset);
	}

}
