package com.Ani.classes;

public class EmployeeDemo {
	public static void main(String[] args) {
		System.out.println("Employee Apllication");

		Employee x = new Employee();
		x.setEmpName("Aniket Gupta");
		x.setEmpDept("Engg");
		x.setProjectName("Sales micro service");

		System.out.println(x.toString());

		EmployeeOper crud = new EmployeeOper();
		int empID = crud.createEmp(x);
		System.out.println("Generate emp ID " + empID);
		x.setEmid(empID);
		System.out.println(x);
	}
}
