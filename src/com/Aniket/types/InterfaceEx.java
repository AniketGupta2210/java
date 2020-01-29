package com.Aniket.types;

public class InterfaceEx {

	public static void main(String[] args) {

	}

}


class Vaidate implements Hardware, Software{
	@Override
	public boolean validate() {
		System.out.println("validating");
		return false;
	}
	
	@Override
	public boolean validate(int count) {
	
		return false;
	}
}

interface Hardware {
	boolean validate(int count);
}

interface Software {
	boolean validate();
}