package com.Ani.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		
		TreeSet<College> collegeSet = new TreeSet<>(new CollegeComparator());
		
		collegeSet.add(new College("Thapar University","Patiala","Punjab"));
		collegeSet.add(new College("PEC", "Chandigarh", "UT"));
		collegeSet.add(new College("VIT", "Velore", "Chennai"));
		System.out.println(collegeSet);
	}

}

class CollegeComparator implements Comparator<College>{

	@Override
	public int compare(College clgOne, College clgTwo) {
		return clgOne.getState().compareTo(clgTwo.getState());
	}

}


public class College{
	String name;
	String city;
	String state;
	
	public College(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}