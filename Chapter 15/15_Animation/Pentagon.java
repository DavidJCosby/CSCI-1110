/*
Author: David Cosby
Date: 01/16/2020

Regular Pentagon class extending from Polygon.
*/

import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


class Pentagon extends Polygon {
	private DoubleProperty x = new SimpleDoubleProperty(0.0);
	private DoubleProperty y = new SimpleDoubleProperty(0.0);
	private DoubleProperty radius = new SimpleDoubleProperty(50.0);
	

	private void recalculatePentagonPoints() {
		ObservableList<Double> list = getPoints();
		list.clear();
		int s = 5;
		for (int i = 0; i < s; i++) {
			list.add(x.get() + radius.get() * Math.cos(2 * i * Math.PI / s)); 
			list.add(y.get() - radius.get() * Math.sin(2 * i * Math.PI / s));
		}
	}
	
	private void setup() {
		setFill(Color.WHITE);
		setStroke(Color.BLACK);
		setRotate(-18);
		recalculatePentagonPoints();
		
		x.addListener( ov -> {
			recalculatePentagonPoints();
		});
		y.addListener( ov -> {
			recalculatePentagonPoints();
		});
		radius.addListener( ov -> {
			recalculatePentagonPoints();
		});
	}
	
	public Pentagon() {
		setup();
	}
	
	public Pentagon(double x, double y) {
		this.x.set(x);
		this.y.set(y);
		setup();
	}
	
	public Pentagon(double radius) {
		this.radius.set(radius);
		setup();
	}
	
	public Pentagon(double x, double y, double radius) {
		this.x.set(x);
		this.y.set(y);
		this.radius.set(radius);
		setup();
	}
	
	public double getX() {
		return x.get();
	}
	
	public double getY() {
		return y.get();
	}
	
	public double getRadius() {
		return radius.get();
	}
	
	public void setRadius(double newRadius) {
		radius.set(newRadius);
	}
	
	public void setX(double newX) {
		x.set(newX);
	}
	
	public void setY(double newY) {
		y.set(newY);
	}
}

