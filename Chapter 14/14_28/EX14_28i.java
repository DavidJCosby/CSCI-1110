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
import javafx.scene.layout.BorderPane;


class EX14_28i extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane clock = new BorderPane();
		Label testLabel = new Label("test");
		clock.setBottom(testLabel);
		Scene scene = new Scene(clock, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Modified Clock");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

