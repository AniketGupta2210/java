package com.Ani.function;

public class StaticKeywordDemo {

	public static void main(String[] args) {
//		Company cp= new Company();
//		cp.getFounder(); due to statiic,,,, class level meathod
		Company.getFounder();
	}

}


class Company{
	static void getFounder(){
		System.out.println("Thomas J. Watson");
	}
}