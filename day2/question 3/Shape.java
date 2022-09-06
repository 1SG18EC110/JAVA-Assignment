package com.example.ass_day2;

public class Shape {
	int length;
	int width;
	int height;
	Shape(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
		public int calArea() {
			return 0;
			
		}
		public static void main (String args[]) {
			Shape rectan = new Rectangle(10,20,30);
			Shape sq = new Square(10,20,30);
			Shape tri = new Triangle(10,20,30);
			
			System.out.println("rectangle area"+rectan.calArea());
			System.out.println(" square area"+sq.calArea());
			System.out.println("Triangle area"+tri.calArea());
			
		}
}