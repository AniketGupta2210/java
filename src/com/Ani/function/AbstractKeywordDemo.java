package com.Ani.function;

public abstract class AbstractKeywordDemo {

	String getComplanyName() {
		return "IBM Corporation";
	}

	abstract String getProject();
	
	public static void main(String[] args) {
		Deails d = new Detaiils();
		d.getPersonelDetails();
	}
}



class Detaiils{
	void getPersonelDetails(){
		System.out.println("Detaiils.getPersonelDetails()");
	}
}