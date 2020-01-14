import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class BallPane extends Pane {
	private DoubleProperty x = new SimpleDoubleProperty();
	private DoubleProperty y = new SimpleDoubleProperty();
	private double r;
	public double speed = 15; // how many pixels to move each keypress
	
	private double screenWidth = 600;
	private double screenHeight = 600;
	
	public Circle circle = new Circle(x.get(), y.get(), r);


	public BallPane() {
		createListeners();
		getChildren().add(circle);
	}
		
	public BallPane(double x, double y, double r) {
		createListeners();
		this.x.set(x);
		this.y.set(y);
		this.r = r;
		circle.setRadius(r);
		getChildren().add(circle);
	}

	
	private void createListeners() {
		x.addListener(ov -> {
			keepXWithinWindow();
			circle.setCenterX(this.x.get());
		});
		y.addListener(ov -> {
			keepYWithinWindow();
			circle.setCenterY(this.y.get());
		});
	}
	
	private void keepXWithinWindow() {
		double newX = x.get();
		
		if (circle.getCenterX() == newX && circle.getRadius() == r) {
			return;
		}
		else {
			if (newX < r) {
				x.set(r);
			}
			else if (newX + r > screenWidth) {
				x.set(screenWidth - r);
			}
		}
	}
	
	private void keepYWithinWindow() {
			double newY = y.get();
			
			if (circle.getCenterY() == newY && circle.getRadius() == r) {
				return;
			}
			else {
				if (newY < r) {
					y.set(r);
				}
				else if (newY + r > screenHeight) {
					y.set(screenHeight - r);
				}
			}
		}
	
	public void setX(double x) {
		this.x.set(x);
	}
	public void setY(double y) {
		this.y.set(y);
	}
	public void setR(double r) {
		this.r = r;
		circle.setRadius(r);
	}
	public double getX() {
		return x.get();
	}
	public double getY() {
		return y.get();
	}
	public double getR() {
		return r;
	}
	
	public void setScreenHeight(double h) {
		screenHeight = h;
	}
	public double getScreenHeight() {
		return screenHeight;
	}
	
	public void setScreenWidth(double w) {
		screenWidth = w;
	}
	public double getScreenWidth() {
		return screenWidth;
	}
		
	public void moveUp() {
		y.set(y.get() - speed);
	}
	public void moveDown() {
		y.set(y.get() + speed);
	}
	public void moveLeft() {
		x.set(x.get() - speed);
	}
	public void moveRight() {
		x.set(x.get() + speed);
	}

}