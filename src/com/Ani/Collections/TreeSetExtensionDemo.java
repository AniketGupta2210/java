package com.Ani.Collections;

import java.util.TreeSet;

public class TreeSetExtensionDemo {

	public static void main(String[] args) {
		
			TreeSet<Furniture> furnSet = new TreeSet<>();
			System.out.println(furnSet);
			
			furnSet.add(new Furniture("Chair", "Plastic"));
			
			Furniture table = new Furniture("Table", "Glass");
					furnSet.add(table);
					
			furnSet.add(new Furniture("Stool", "Wood"));
			furnSet.add(new Furniture("Sofa", "Cloth"));
					
					System.out.println(furnSet);
	}

}


class Furniture implements Comparable<Furniture>{
	String name;
	String material;
	
	
	
	public Furniture(String name, String material) {
		super();
		this.name = name;
		this.material = material;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public int compareTo(Furniture another) {

		return material.compareTo(another.getMaterial());
	}


	@Override
	public String toString() {
		return "Furniture [name=" + name + ", material=" + material + "]";
	}
	
	
	
}