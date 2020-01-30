package com.Ani.company;

import java.util.Comparator;


public class CompanyParameters {

		String name;
		int Id;
		String Location;
		String Founder;
		
		
		public CompanyParameters(String name, int id, String location, String founder) {
			super();
			this.name = name;
			Id = id;
			Location = location;
			Founder = founder;
		}


		@Override
		public String toString() {
			return "CompanyParameters [name=" + name + ", Id=" + Id + ", Location=" + Location + ", Founder=" + Founder
					+ "]";
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getId() {
			return Id;
		}


		public void setId(int id) {
			Id = id;
		}


		public String getLocation() {
			return Location;
		}


		public void setLocation(String location) {
			Location = location;
		}


		public String getFounder() {
			return Founder;
		}


		public void setFounder(String founder) {
			Founder = founder;
		}
		
		
		
}


class CompanyComparator implements Comparator<CompanyParameters>{

	@Override
	public int compare(CompanyParameters clgOne, CompanyParameters clgTwo) {
		return clgOne.getName().compareTo(clgTwo.getName());
	}

}