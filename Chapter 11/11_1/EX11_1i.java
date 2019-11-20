/*
Author: David Cosby
Date: 11/20/2001
Uses user input to create a Triangle. Displays the triangle's Area, perimeter, color, and its filled status. */

import java.util.Scanner;

class EX11_1i {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("First side Length: ");
		double s1 = input.nextDouble();
		
		System.out.print("Second side Length: ");
		double s2 = input.nextDouble();
		
		System.out.print("Third side Length: ");
		double s3 = input.nextDouble();
		
		System.out.print("Triangle color: ");
		String color = input.next();
		
		System.out.print("Filled triangle? (true/false): ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(s1, s2, s3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("\n\nTriangle");
		System.out.println("Area\t  : " + triangle.getArea());
		System.out.println("Perimeter : " + triangle.getPerimeter());
		System.out.println("Color\t  : " + triangle.getColor());
		System.out.println("Filled \t  : " + triangle.isFilled());

	}
}