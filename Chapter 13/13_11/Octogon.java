
/*
Author: David Cosby
Date: 12/13/2019
Octogon class with sides of equal length and various methods. Extended from the abstract Geometric object, to be used by EX13_11i.
*/

class Octogon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {
	private double sideLength = 1.0;

	Octogon() {
		super();
	}
	
	Octogon(double length) {
		sideLength = length;

	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double length) {
		sideLength = length;
	} 
		
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * sideLength * sideLength);
	}
	
	public double getPerimeter() {
		return sideLength * 8;
	}
	
	public String toString() {
		return "Octogon: Side Length = " + sideLength;
	}
	
	public void howToColor() {
		System.out.println("Color all three sides");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public int compareTo(GeometricObject otherObject) {
		double selfArea = getArea();
		double otherArea = otherObject.getArea();
		if (selfArea > otherArea) {
			return 1;
		}
		else if (selfArea < otherArea) {
			return -1;
		}
		else {
			return 0;
		}
	}
}