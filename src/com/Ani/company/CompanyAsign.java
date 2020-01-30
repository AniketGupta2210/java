package com.Ani.company;

import java.util.Scanner;

public class CompanyAsign {

	public static void main(String[] args) {
			
		Scanner sb = new Scanner(System.in);
		
		System.out.println("Enter number of companies");
		int key =Integer.parseInt(sb.nextLine());
		
		CompanyOper obj = new CompanyOper();
		
		int bell=obj.Start();
		
		switch (bell) {
		case 1:
			
				obj.Create(key);
				break;

		case 2:
			
			obj.Retrive(key);
			
			break;
		case 3:
			obj.Update(key);
			break;
			
		case 4:
			obj.Deletion(key);
			break;
			
			default:
			break;
		}
		
		
		
		
	}

}
