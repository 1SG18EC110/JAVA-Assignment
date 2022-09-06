package com.example.ass_day2;

public class Triangle extends Shape {
	Triangle(int length,int width,int height){
	super(length,width,height);
}
public int calArea() {
	return (int) (0.5*width*height);
}

}
