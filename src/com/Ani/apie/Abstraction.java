package com.Ani.apie;

public class Abstraction {

	public static void main(String[] args) {
		int count=Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		Check c= new Check();
		c.getInfo();
		System.out.println("c.companyname()");
		c.livesin();
	}

}
