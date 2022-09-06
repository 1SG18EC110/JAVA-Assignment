package com.example.ass_day2;

public abstract class Employee {
	int empid;
	String empName;
	
	double basicPay;
	int noOfLeaves;
	
	Emplyoee(int empid, String empName, double basicPay,int noOfLeaves){
		this.empid=empid;
		this.empName=empName;
		this.basicPay=basicPay;
		this.noOfLeaves=noOfLeaves;
	}
	
	public  abstract double calSalary();
}

