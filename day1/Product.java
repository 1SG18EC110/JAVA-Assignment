package com.example.assignment;

public class Product {
	 
    int proID;
    String proName;
    double proPrice;

    public double proprice(double proPrice ) {
                    double p= proPrice *+ proPrice;
                    return p;                             
    }

    public static void main(String[] args) {
                    
                    Product p =new Product();
                    p.proID=123;
                    p.proName="Phone";
                    System.out.println(p.proID);
                    System.out.println(p.proName);
                    System.out.println("Gst "+p.proprice(12));
    }

}
