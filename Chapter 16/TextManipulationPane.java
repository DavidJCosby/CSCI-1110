import javafx.scene.layout.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;

import javafx.scene.text.Text;


public class TextManipulationPane extends BorderPane {
	HBox radioButtonContainer = new HBox(20);
	RadioButton redButton = new RadioButton("Red");
	RadioButton yellowButton = new RadioButton("Yellow");
	RadioButton blackButton = new RadioButton("Black");
	RadioButton orangeButton = new RadioButton("Orange");
	RadioButton greenButton = new RadioButton("Green");
	
	Text text = new Text(50, 50, "DEFAULT MESSAGE");
	
	HBox movementButtonContainer = new HBox(20);
	Button leftButton = new Button("<=");
	Button rightButton = new Button("=>");
	
	
	public TextManipulationPane() {
		constructGUI();
	}
	
	public TextManipulationPane(String message) {
		constructGUI();
		text.setText(message);
	}
	
	
	private void constructGUI() {
		blackButton.setSelected(true);
		radioButtonContainer.getChildren().addAll(
			redButton, yellowButton, blackButton, orangeButton, greenButton);
		setTop(radioButtonContainer);
		setCenter(text);
		movementButtonContainer.getChildren().addAll(
			leftButton, rightButton);
		setBottom(movementButtonContainer);
	}
	
}