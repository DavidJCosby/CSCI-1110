/*
Author: David Cosby
Date: x/x/xxxx

Code description goes here
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EX14_15i extends Application {
	@Override
	public void start(Stage primaryStage) {   
		Scene scene = new Scene(new StopSign(), 400, 400);
		primaryStage.setTitle("Stop Sign");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

