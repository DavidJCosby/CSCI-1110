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


public class EX_15_Animations_i extends Application {
		
	public void start(Stage primaryStage) {
		AnimationPane animation = new AnimationPane();
		Scene scene = new Scene(animation, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Pentagon Animation");
		primaryStage.show();
		
		animation.togglePlaying();

	}
}


