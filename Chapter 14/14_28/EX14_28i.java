/*
Author: David Cosby
Date: 12/17/2019

Creates a ClockPane given a random time, displays the clock with only the hour and minute hands visible.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;


public class EX14_28i extends Application {
	
	private int randomInt(int floor, int ceil) {
		double seed = Math.random();
		return (int) (floor + (ceil-floor) * seed + 0.5);
	}
	
	@Override
	public void start(Stage primaryStage) {
		final int WIDTH = 250;
		final int HEIGHT = 250;
		
		ClockPane clock = new ClockPane();
		clock.setW(WIDTH);
		clock.setH(HEIGHT);
		clock.setSecondHandVisible(false);
		
		int h = randomInt(0, 11);
		clock.setHour(h);
		int m = randomInt(0, 1) * 30;
		clock.setMinute(m);
		
		Scene scene = new Scene(clock, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Modified Clock");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

