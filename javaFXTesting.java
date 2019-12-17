import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class javaFXTesting extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new FlowPane();
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
		
		Label label = new Label("JavaFX");
		label.setFont(Font.font("Helvetica", FontWeight.THIN, FontPosture.REGULAR, 20));
		pane.getChildren().addAll(circle, label);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Font Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}