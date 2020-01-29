package com.Aniket.varialbles;

public class StaticVariableDemo {

	public static void main(String[] args) {
		Vendor hit = new Vendor();
		hit.createVendor("Lenovo Corp.");
		hit.totalVendors();

		Vendor HungerBox = new Vendor();
		HungerBox.createVendor("HungerBox Food Service");
		HungerBox.totalVendors();

		Vendor Sudexo = new Vendor();
		Sudexo.createVendor("Sudexo Food Service");
		Sudexo.totalVendors();
	}

}

class Vendor {
	static int totalVendor;

	void createVendor(String name) {
		System.out.println("Creating a Vendor " + name);
		totalVendor++;
	}

	void totalVendors() {
		System.out.println("No of vendors : " + totalVendor);
	}
}