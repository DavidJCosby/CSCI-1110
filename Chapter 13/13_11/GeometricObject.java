/*
Author: David Cosby
Date: 12/9/2019
Abstract Geometric Object class with data properties "color", "filled", and "dateCreated". To be extended by Triangle.
*/


import java.util.Date;

public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	protected GeometricObject(String c, boolean fill) {
		setColor(c);
		setFilled(fill);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean fill) {
		filled = fill;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

}