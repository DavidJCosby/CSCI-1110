/*
Author: David Cosby
Date: 01/16/2020

Creates an AnimationPane, uses left and right mouse clicks to toggle between playing and not playing.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;


public class EX_15_Animations_i extends Application {
		
	public void start(Stage primaryStage) {
		AnimationPane animation = new AnimationPane();
		
		animation.setOnMouseClicked( e -> {
			if (e.getButton() != MouseButton.MIDDLE) {
				animation.togglePlaying();	
			}
		});
		
		Scene scene = new Scene(animation, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Pentagon Animation");
		primaryStage.show();
		
		animation.togglePlaying();
	}
}


