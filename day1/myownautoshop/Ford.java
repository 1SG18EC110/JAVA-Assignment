package com.example.assignment;

public class Ford extends car {
	int year;
	double manufactureDiscount;
	Ford(int speed,double regularPrice,String color,double manufactureDiscount){
		super(speed, regularPrice, color);
		this.manufactureDiscount=manufactureDiscount;
	}
	public double getSalePrice() {
		
		return super.getSalePrice()-manufactureDiscount;
		
	}
}
