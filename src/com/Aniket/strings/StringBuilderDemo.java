package com.Aniket.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String name="Aniket";
		name= name + "Gupta";
		
		StringBuffer sc = new StringBuffer();
		sc.append("IBM");
		sc.append("corporation");
		
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Aniket");
		System.out.println(sb);
		
		sb.append(" Gupta");
		System.out.println(sb);
	}

}
