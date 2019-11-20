class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle() {
		
	}
	
	Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getSide1Length() {
		return side1;
	}
	
	public double getSide2Length() {
		return side2;
	}

	public double getSide3Length() {
		return side3;
	}
	
	public void setSide1Length(double length) {
		side1 = length;
	} 

	public void setSide2Length(double length) {
		side2 = length;
	}
	
	public void setSide3Length(double length) {
		side3 = length;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}