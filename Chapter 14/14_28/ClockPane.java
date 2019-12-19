/*
Author: David Cosby
Date: 12/19/2019

ClockPane class extended from from Pane, used to show time in an analog format.
*/

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import java.util.Date;


class ClockPane extends Pane {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	private boolean hourHandVisible = true;
	private boolean minuteHandVisible = true;
	private boolean secondHandVisible = true;
	private double w = 100.0;
	private double h = 100.0;
	
	
	public ClockPane() {
		paintClock();
	}
	
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setCurrentTime() {
		Date date = new Date();
		hour = date.getHours();
		minute = date.getMinutes();
		second = date.getSeconds();
		paintClock();
	}
	
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}
	
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setW(double width) {
		w = width;
		paintClock();
	}
	
	public void setH(double height) {
		h = height;
		paintClock();
	}
	
	public double getW() {
		return w;
	}
	
	public double getH() {
		return h;
	}
	
	public void setHourHandVisible(boolean visible) {
		hourHandVisible = visible;
		paintClock();
	}
	
	public void setMinuteHandVisible(boolean visible) {
		minuteHandVisible = visible;
		paintClock();
	}
	
	public void setSecondHandVisible(boolean visible) {
		secondHandVisible = visible;
		paintClock();
	}
	
	public boolean getHourHandVisible() {
		return hourHandVisible;
	}
	
	public boolean getMinuteHandVisible() {
		return minuteHandVisible;
	}
	
	public boolean getSecondHandVisible() {
		return secondHandVisible;
	}
	
	protected void paintClock() {
		getChildren().clear();
		double clockRadius = Math.min(w, h) * 0.4;
		double centerX = w/2;
		double centerY = h/2;

		paintClockRim(clockRadius, centerX, centerY);		
		paintNumbers(clockRadius, centerX, centerY);
		
		if (secondHandVisible) {
			paintSecondHand(clockRadius, centerX, centerY);
		}
		if (minuteHandVisible) {
			paintMinuteHand(clockRadius, centerX, centerY);
		}
		if (hourHandVisible) {
			paintHourHand(clockRadius, centerX, centerY);
		}
	}
	
	private void paintClockRim(double clockRadius, double centerX, double centerY) {
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		getChildren().add(circle);
	}
	
	private void paintNumbers(double clockRadius, double centerX, double centerY) {
		Text hour12 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text hour3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text hour6 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		Text hour9 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		getChildren().addAll(hour12, hour3, hour6, hour9);
	}
	
	private void paintSecondHand(double clockRadius, double centerX, double centerY) {
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
		Line secondHand = new Line(centerX, centerY, secondX, secondY);
		secondHand.setStroke(Color.RED);
		getChildren().add(secondHand);
	}
	
	private void paintMinuteHand(double clockRadius, double centerX, double centerY) {
		double mLength = clockRadius * 0.65;
		double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line minuteHand = new Line(centerX, centerY, minuteX, minuteY);
		minuteHand.setStroke(Color.BLUE);
		getChildren().add(minuteHand);
	}
	
	private void paintHourHand(double clockRadius, double centerX, double centerY) {
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60) * (2 * Math.PI / 12));
		Line hourHand = new Line(centerX, centerY, hourX, hourY);
		hourHand.setStroke(Color.GREEN);
		getChildren().add(hourHand);
	}
}