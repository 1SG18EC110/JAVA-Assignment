package com.example.ass_day2;

public class Staff extends Employee {

	Staff(int empid, String empName, double basicPay, int noOfLeaves) {
		super(empid, empName, basicPay, noOfLeaves);
		
	}

	@Override
	public double calSalary() {
		
		return 0.18*basicPay;
	}
	public String toString() {
		return empName+empid;
	}

}
