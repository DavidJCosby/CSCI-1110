/*
Author: David Cosby
Date: 01/27/2020

Creates a countdownPane and adds it to the primaryStage.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EX16_21i extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		CountdownPane pane = new CountdownPane();		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise16_21");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}