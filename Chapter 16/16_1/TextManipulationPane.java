import javafx.scene.layout.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;


public class TextManipulationPane extends BorderPane {
	HBox radioButtonContainer = new HBox(20);
	RadioButton redButton = new RadioButton("Red");
	RadioButton yellowButton = new RadioButton("Yellow");
	RadioButton blackButton = new RadioButton("Black");
	RadioButton orangeButton = new RadioButton("Orange");
	RadioButton greenButton = new RadioButton("Green");
	ToggleGroup colorGroup = new ToggleGroup();
	
	TextDisplayPane textPane = new TextDisplayPane("Programming is fun");
	
	HBox movementButtonContainer = new HBox(20);
	Button leftButton = new Button("<=");
	Button rightButton = new Button("=>");
	
	
	public TextManipulationPane() {
		setup();
	}
	
	public TextManipulationPane(String message) {
		setup();
		textPane.setMessage(message);
	}
	
	private void setup() {
		constructGUI();
		bindButtons();
		orangeButton.fire();
	}
	
	private void constructGUI() {
		constructTop();
		constructCenter();
		constructBottom();
	}
	
	private void constructTop() {
		redButton.setToggleGroup(colorGroup);
		yellowButton.setToggleGroup(colorGroup);
		blackButton.setToggleGroup(colorGroup);
		orangeButton.setToggleGroup(colorGroup);
		greenButton.setToggleGroup(colorGroup);

		radioButtonContainer.setAlignment(Pos.CENTER);
		radioButtonContainer.getChildren().addAll(
			redButton, yellowButton, blackButton, orangeButton, greenButton);
		
		setTop(radioButtonContainer);
	}
	
	private void constructCenter() {
		textPane.setStyle("-fx-border-style: none none solid none; -fx-border-width: 1px; -fx-border-color: grey;");
		setCenter(textPane);
	}
	
	private void constructBottom() {
		movementButtonContainer.setAlignment(Pos.CENTER);
		movementButtonContainer.getChildren().addAll(
			leftButton, rightButton);
		
		setBottom(movementButtonContainer);
	}
	
	private void bindButtons() {
		bindRadioButtons();
		bindMovementButtons();
	}
	
	private void bindRadioButtons() {
		redButton.setOnAction(e -> {
			textPane.setColor(Color.RED);
		});
	
		yellowButton.setOnAction(e -> {
			textPane.setColor(Color.GOLD);
		});
		
		blackButton.setOnAction(e -> {
			textPane.setColor(Color.BLACK);
		});
		
		orangeButton.setOnAction(e -> {
			textPane.setColor(Color.DARKORANGE);
		});
		
		greenButton.setOnAction(e -> {
			textPane.setColor(Color.GREEN);
		});
	}
	
	private void bindMovementButtons() {
		leftButton.setOnAction( e -> {
			textPane.moveLeft();
		});
		
		rightButton.setOnAction( e -> {
			textPane.moveRight();
		});
	}
	
}