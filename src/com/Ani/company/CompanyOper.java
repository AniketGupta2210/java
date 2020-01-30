package com.Ani.company;

import java.util.Scanner;
import java.util.TreeSet;



public class CompanyOper{
 
	Scanner sc = new Scanner(System.in);
		
		
		
	int Start() {
	
	System.out.println("What do want to do");
	System.out.println("Press 1 to create company");
	System.out.println("Press 2 to retrive company");
	System.out.println("Press 3 to update company");
	System.out.println("Press 4 to delete company");
	int numr = Integer.parseInt(sc.nextLine());
	return numr;
	
	}
	
	void Create(int val) {
		
		System.out.println("Enter company Name");
		String compname = sc.nextLine();
		System.out.println("Enter company ID");
		int compID = Integer.parseInt(sc.nextLine());
		System.out.println("Enter company Location");
		String compLoc = sc.nextLine();
		System.out.println("Enter Company Founder");
		String compFond = sc.nextLine();
		
//		TreeSet<CompanyParameters> companySet = new TreeSet<>(new CompanyComparator());
//		companySet.add(compname, compID, compLoc,compFond);
		
		CompanyParameters comp[] = new CompanyParameters[val];
		
		for (int i = 0; i < comp.length; i++) {
			comp[i]=new CompanyParameters(compname, compID, compLoc, compFond);
		}
		
		
	}
	
	void Retrive(int length) {
		
		CompanyParameters comp[] = new CompanyParameters[length];
		
		for (int i = 0; i <length; i++) {
			System.out.println("Enter ID to be found");
			int val = Integer.parseInt(sc.nextLine());
					if(val == comp[i].getId()) {
						System.out.println(comp[i]);
					}
					else
						System.out.println("no such Id found");
		}
	}
	
	void Update(int length) {
		
		CompanyParameters comp[] = new CompanyParameters[length];
		
		for (int i = 0; i <length; i++) {
			System.out.println("Enter ID to be update");
			int val = Integer.parseInt(sc.nextLine());
					if(val == comp[i].getId()) {
						System.out.println("Update Name");
						String name = sc.nextLine();
						comp[i].setName(name);;
						
						System.out.println("Update Location");
						String location = sc.nextLine();
						comp[i].setLocation(location);;
					}
					else
						System.out.println("no such Id found");
		}
	}
	
	void Deletion(int lenght) {
			CompanyParameters comp[] = new CompanyParameters[lenght];
		
			for (int i = 0; i <lenght; i++) {
			System.out.println("Enter ID to be delete");
			int val = Integer.parseInt(sc.nextLine());
			if(val == comp[i].getId())
			{
				for (int j = i; j < comp.length; j++) {
					comp[j]=comp[j=1];
				}
			}
			else 
				System.out.println("No Id found");
}
			for (int i = 0; i < comp.length; i++) {
				System.out.println(comp[i]);
			}
	}
}
