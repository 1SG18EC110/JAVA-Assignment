package com.example.ass_day2;

public class Usingppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technicalemp t=new Technicalemp(101,"abc",1000,5,"Java");
		Staff s =new Staff(102,"edf",400,3);
		Adress a = new Adress(8,"Bangalore","chikkabanvara",560090);
		Adress a1 = new Adress(10,"Bangalore","dasarahalli",560057);
		System.out.println(a.toString());
		System.out.println(t.toString());
		System.out.println("Technical staff salary"+t.calSalary());
		System.out.println("----staff----");
		System.out.println(a1.toString());
		System.out.println(s.toString());
		System.out.println("Staff salary"+s.calSalary());
		
		
	}

}
