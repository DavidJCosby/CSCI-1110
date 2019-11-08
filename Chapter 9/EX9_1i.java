/*
Author: David Cosby
Date: 11/8/2019

Creates and tests a rectangle class.
*/

import java.awt.*;

class Rectangle {
	double width = 1;
	double height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double w, double h) {
		height = h;
		width = w;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
}


class EX9_1i {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The first rectangle has an area of " + r1.getArea() + " and a perimeter of " + r1.getPerimeter() + ". It has a width of " + r1.width + " and a height of " + r1.height + ".");
		System.out.println("The second rectangle has an area of " + r2.getArea() + " and a perimeter of " + r2.getPerimeter() + ". It has a width of " + r2.width + " and a height of " + r2.height + ".");
	}
}