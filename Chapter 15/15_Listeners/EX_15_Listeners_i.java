/*
Author: David Cosby
Date: 01/10/2020

Creates a BallPane and binds keyboard inputs to its movement methods.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;


public class EX_15_Listeners_i extends Application {
	
	public BallPane setupBall() {
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
	
	public VBox setupButtonsAndBindTo(BallPane ball) {
		VBox container = new VBox();
		container.setAlignment(Pos.TOP_RIGHT);
		
		Button upButton = new Button("Up");
		upButton.setFocusTraversable(false);
		upButton.setOnAction(e -> {
			ball.moveUp();
		});
		
		Button leftButton = new Button("Left");
		leftButton.setFocusTraversable(false);
		leftButton.setOnAction(e -> {
			ball.moveLeft();
		});
		
		Button rightButton = new Button("Right");
		rightButton.setFocusTraversable(false);
		rightButton.setOnAction(e -> {
			ball.moveRight();
		});
		
		Button downButton = new Button("Down");
		downButton.setFocusTraversable(false);
		downButton.setOnAction(e -> {
			ball.moveDown();
		});
		
		container.getChildren().addAll(upButton, leftButton, rightButton, downButton);
		return container;
	}
	
	public void start(Stage primaryStage) {
		BallPane ball = setupBall();
		VBox buttons = setupButtonsAndBindTo(ball);
		BorderPane root = new BorderPane();
		
		root.setCenter(ball);
		root.setRight(buttons);
		
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Ball bound to keyboard and buttons");
		primaryStage.show();
		
		ball.setScreenWidth(ball.getWidth());
		ball.setScreenHeight(ball.getHeight());
		
		ball.requestFocus();
	}
}


