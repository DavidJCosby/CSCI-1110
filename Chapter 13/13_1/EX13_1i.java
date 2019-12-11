/*
Author: David Cosby
Date: 12/11/2019
Takes input from the user to create a Triangle, which is derived from the abstract GeometricObject class. */

import java.util.Scanner;

class EX13_1i {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Length of side 1: ");
		double s1 = input.nextDouble();
		System.out.print("Length of side 2: ");
		double s2 = input.nextDouble();
		System.out.print("Length of side 3: ");
		double s3 = input.nextDouble();
		
		System.out.print("Fill the triangle? (True/False): ");
		boolean fill = input.nextBoolean();
		
		System.out.print("Color of the triangle: ");
		String color = input.next();
		
		Triangle newTriangle = new Triangle(s1, s2, s3);
		newTriangle.setFilled(fill);
		newTriangle.setColor(color);
		
		System.out.println("\nTriangle Area: " + newTriangle.getArea());
		System.out.println("Triangle Perimeter: " + newTriangle.getPerimeter());
		System.out.println("Triangle Color: " + newTriangle.getColor());
		System.out.println("Triangle Filled: " + newTriangle.isFilled());
	}
}