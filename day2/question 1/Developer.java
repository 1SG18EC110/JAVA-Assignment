package com.example.ass_day2;

public class Developer extends Employee{
	double devSal;

	Developer(int empId,String empName,double empSal){
		super(empId,empName,empSal);
		
	}
	public double devSalary() {
		devSal =empSal*10;
		return devSal ;
	}
	public void  disDev() {
		System.out.println("employee id"+ empId +"name"+ empName);
		System.out.println("Salary of Devloper"+ devSal);
	}
}
