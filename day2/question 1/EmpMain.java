package com.example.ass_day2;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester T =new Tester(101,"abd",123);
		Manager e1 = new Manager(102,"erf",456);
		Developer d= new Developer(103,"yui",789);
		
		//Manager e =new Manager();
		//e.display();
		e1.Cal();
		e1.dispManger();
		d.devSalary();
		d.disDev();
		T.salCal(1000);
		T.display();
		
		}

}
