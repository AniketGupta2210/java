package com.Ani.function;

public class FinalMethodDemo {

	static final int value=100;
	
	public static void main(String[] args) {
	System.out.println(value);
	//value=200; due to final
	System.out.println("Update  " + value);
	}

}




class Data{
	void stdData(){
		System.out.println("Data.setData()");
	}
	
	final void spcData(){
		System.out.println("Data.setData()");
	}
}


class CompanyData extends Data{
	@Override
	void stdData() {
		super.stdData();
	}
}