/*
Author: David Cosby
Date: 01/10/2020

Creates a BallPane and binds keyboard inputs to its movement methods.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;


public class EX_15_Listeners_i extends Application {
	
	public BallPane setUpBall() {
		BallPane ball = new BallPane(300, 300, 50);		
		ball.setOnKeyPressed( e -> {
			if (e.getCode() == KeyCode.UP) {
				ball.moveUp();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				ball.moveDown();
			}
			else if (e.getCode() == KeyCode.LEFT) {
				ball.moveLeft();
			}
			else if (e.getCode() == KeyCode.RIGHT) {
				ball.moveRight();
			}
		});
		
		return ball;
	}
	
	public void start(Stage primaryStage) {
		BallPane ball = setUpBall();
		
		
		Scene scene = new Scene(ball, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ye");
		primaryStage.show();
		
		ball.requestFocus();
	}


}


