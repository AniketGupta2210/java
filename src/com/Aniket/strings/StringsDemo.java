package com.Aniket.strings;

public class StringsDemo {

	public static void main(String[] args) {
		String name = "IBM";
		System.out.println(name);

		name = name + "Corp";
		System.out.println(name);

		String myName = "Aniket Gupta";
		String fullName = new String("Aniket Gupta");

		System.out.println(myName == fullName);

		if (myName.equals(fullName))
			System.out.println("Both are equal");
		else
			System.out.println("Not Same");
	}

}
