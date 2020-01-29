package com.Ani.misc;

public class ThisMethodDemo {

	public static void main(String[] args) {
		Computer cr= new Computer("Lenovo","Tp",(byte)8,(byte)16,(byte)15);
		
		System.out.println(cr);
	}

}




class Computer {
	
	String manufacturer;
	String model;
	byte ram;
	byte hdd;
	byte screenSize;

	public Computer() {
		super();
	}

	

	public Computer(byte ram, byte hdd, byte screenSize) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.screenSize = screenSize;
	}
	
	

	public Computer(String manufacturer, String model, byte ram, byte hdd, byte screenSize) {
		this(ram,hdd,screenSize);
		this.manufacturer = manufacturer;
		this.model = model;
		
	}



	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + ", hdd=" + hdd
				+ ", screenSize=" + screenSize + "]";
	}
	
	
	
	
}