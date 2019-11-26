/*
Author: David Cosby
Date: 11/8/2019

Tests the Rectangle class by constructing two different rectangles of different dimensions and reading off its area, perimeter, width, and height.
*/


public class EX9_1i {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The first rectangle has an area of " + r1.getArea() + " and a perimeter of " + r1.getPerimeter() + ". It has a width of " + r1.width + " and a height of " + r1.height + ".");
		System.out.println("The second rectangle has an area of " + r2.getArea() + " and a perimeter of " + r2.getPerimeter() + ". It has a width of " + r2.width + " and a height of " + r2.height + ".");
	}
}