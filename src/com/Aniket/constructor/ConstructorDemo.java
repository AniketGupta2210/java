package com.Aniket.constructor;

public class ConstructorDemo {
	public static void main(String[] args) {
		Computer lenovo = new Computer("Lenovo", "TP", 30000 );
//		lenovo.setManufacturer("Lennovo");
//		lenovo.setCosr(30000);
//		lenovo.setModel("TP");
		System.out.println(lenovo);
	}
	
	
}

class Computer {

	@Override
	public String toString() {
		return "Computer [Manufacturer=" + Manufacturer + ", Model=" + Model + ", Cosr=" + Cosr + "]";
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String manufacturer, String model, long cosr) {
		//super();
		Manufacturer = manufacturer;
		Model = model;
		Cosr = cosr;
	}

	String Manufacturer;
	String Model;
	long Cosr;

//	public String getManufacturer() {
//		return Manufacturer;
//	}
//
//	public void setManufacturer(String manufacturer) {
//		this.Manufacturer = manufacturer;
//	}
//
//	public String getModel() {
//		return Model;
//	}
//
//	public void setModel(String model) {
//		this.Model = model;
//	}
//
//	public long getCosr() {
//		return Cosr;
//	}
//
//	public void setCosr(long cosr) {
//		this.Cosr = cosr;
//	}

}
