/*
Author: David Cosby
Date: 01/21/2020

Creates a GUI program that allows to user to change the color of some text and move it left and right.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class EX_16_1i extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextManipulationPane pane = new TextManipulationPane("Programming is fun");

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Font Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}