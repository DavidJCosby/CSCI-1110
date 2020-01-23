import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

class TextDisplayPane extends Pane {
	Text text = new Text("DEFAULT MESSAGE");
	DoubleProperty x = new SimpleDoubleProperty(30);
	final double y = 40;
	
	
	private void setup() {
		constructGUI();
		startListeners();
	}
	
	public void constructGUI() {
		text.setFont(Font.font("SansSerif", 20));
		text.setX(x.get());
		text.setY(y);
		getChildren().add(text);
	}
	
	public void startListeners() {
		
		x.addListener( ov -> {
			double xValue = x.get();

			if (xValue < 0) {
				x.set(0);
			}
			else if (xValue > 305) {
				x.set(300);
			}
			else {
				text.setX(x.get());
			}
		});
	}
	
	public TextDisplayPane() {
		setup();
	}
	
	public TextDisplayPane(String message) {
		setup();
		setMessage(message);
	}
	
	public void setMessage(String message) {
		text.setText(message);
	}
	
	public void setColor(Color color) {
		text.setFill(color);
	}
	
	public void moveLeft() {
		x.set(x.get() - 20);
	}
	
	public void moveRight() {
		x.set(x.get() + 20);
	}
	
}