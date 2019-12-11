/*
Author: David Cosby
Date: 12/11/2019
Creates an array of GeometricObjects and asks each one that is colorable how you should color it. */

class EX13_7i {
	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[5];
		
		for (int i = 0; i < 5; i++) {
			objects[i] = new Triangle(i+1, i+1, i+1);
		}	
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Area : " + objects[i].getArea() + ", ");
			if (objects[i] instanceof Colorable) {
				((Triangle) objects[i]).howToColor();
			}
		}
	}
}