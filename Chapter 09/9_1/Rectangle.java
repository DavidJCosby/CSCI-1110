public class Rectangle {
	double width = 1;
	double height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double w, double h) {
		height = h;
		width = w;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
	
}