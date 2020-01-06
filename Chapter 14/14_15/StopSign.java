/*
Author: David Cosby
Date: 1/6/2020

StopSign class made with code from ShowPolygon.java, executed by EX14_15i.java.
*/


import javafx.collections.ObservableList;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;


class StopSign extends StackPane {
	
	public StopSign() {
		paint();
	}
	
	private void paint() {
		paintSign();
		paintText();
	}
	
	private void paintSign() {
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		int s = 8;
		for (int i = 0; i < s; i++) {
			double angle = 2 * i * Math.PI / s;
			list.add(centerX + radius * Math.cos(angle)); 
			list.add(centerY - radius * Math.sin(angle));
		}     
		
		polygon.setRotate(22.5);
		getChildren().clear();
		getChildren().add(polygon); 
	}
	
	private void paintText() {
		Font signFont = Font.font("SansSerif", FontWeight.BOLD, 88);
		Label stopText = new Label("STOP");
		stopText.setTextFill(Color.WHITE);
		stopText.setFont(signFont);
		getChildren().add(stopText);
	
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();	
	}
}