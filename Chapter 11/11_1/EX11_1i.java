import java.util.Scanner;

class EX11_1i {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("First side Length: ");
		double s1 = input.nextDouble();
		
		System.out.print("\nSecond side Length: ");
		double s2 = input.nextDouble();
		
		System.out.print("\nThird side Length: ");
		double s3 = input.nextDouble();
		
		System.out.print("\nTriangle color: ");
		String color = input.next();
		
		System.out.print("\nFilled triangle? (true/false): ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(s1, s2, s3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("\n\nTriangle");
		System.out.println("Area\t  : " + triangle.getArea());
		System.out.println("Perimeter : " + triangle.getPerimeter());
		System.out.println("color\t  : " + triangle.getColor());
		System.out.println("Filled \t  : " + triangle.isFilled());

	}
}