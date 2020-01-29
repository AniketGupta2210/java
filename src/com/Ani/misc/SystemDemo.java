package com.Ani.misc;

public class SystemDemo {

	public static void main(String[] args) {

		System.out.println("Hell");
		System.err.println("Warning");

		System.out.println("SystemDemo.main()");
		
		String name ="Rejesh Chopara";
		int empNo = 351;
		
		System.out.println("Employee (" + name + ") id is (" + empNo + ")");
		System.out.printf("Employee (%s) id is (%d)",name,empNo);

	}

}
