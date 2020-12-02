package org.com1027;

public class Circle {
	private double radius;
	private double c;
	private double a;
	private double length;
	Circle(int r) {
		
	}
	public double getRadius() {
		return radius;
	}
	public double calculateCircumference() {
		this.c = 2*3.14*radius;
		return c;
	}
	public double calculateArea()  {
		this.a = 3.14*radius*radius;
		return a;
	}
	public double subtractFromSquareArea(double length) {
		this.length = length*length;
		this.length = a - length;
		return length;
	}
	
}
