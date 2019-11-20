/*
Author: David Cosby
Date: 11/18/2001
Geometric Object class with data properties "color", "filled", and "dateCreated". To be extended by Triangle.
*/


import java.util.Date;

class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String c, boolean fill) {
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
}