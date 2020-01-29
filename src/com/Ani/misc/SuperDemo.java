package com.Ani.misc;

public class SuperDemo {

	public static void main(String[] args) {

		ServiceCompany sc = new ServiceCompany();
		sc.info();
		
	}

}



class Company{

	public Company() {
		super();
	System.out.println("Company constructor");
	}
	
	void info(){
		System.out.println("Company.info()");
	}
	
}

class ServiceCompany extends Company{

	public ServiceCompany() {
		super();
	}
	
	
}