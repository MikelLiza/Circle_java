package org.com1027;

public class testCircle {
	public static void main(String[] args) {
		Circle c = new Circle(1);
		System.out.println("Radius " + c.getRadius() + ", circumference " + c.calculateCircumference() + ", area " + c.calculateArea());
		System.out.println("Area left from square " + c.subtractFromSquareArea(1.773));
		
		
	}
}
