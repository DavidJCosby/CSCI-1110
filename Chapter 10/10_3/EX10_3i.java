/*
Author: David Cosby
Date: 11/12/2019

Tests each of the methods in the MyInteger class
*/

class EX10_3i {
	public static void main(String[] args) {
		MyInteger x = new MyInteger(53);
		MyInteger z = new MyInteger(11);
		
		System.out.println("X: " + x.getValue());
		System.out.println("is even: " + x.isEven());
		System.out.println("is odd: " + x.isOdd());
		System.out.println("is prime: " + x.isPrime());
		
		System.out.println("\nY: 64");
		System.out.println("is even: " + MyInteger.isEven(64));
		System.out.println("is odd: " + MyInteger.isOdd(64));
		System.out.println("is prime: " + MyInteger.isPrime(64));
		
		System.out.println("\nZ: " + z.getValue());
		System.out.println("is even: " + MyInteger.isEven(z));
		System.out.println("is odd: " + MyInteger.isOdd(z));
		System.out.println("is prime: " + MyInteger.isPrime(z));
		
		System.out.println("\nX == 53: " + x.equals(53));
		System.out.println("X == Z: " + x.equals(z));
		
		System.out.println("\nCasting characters '5', '2,' and '3' to an integer.");
		char[] chars = {'5', '2', '3'};
		System.out.println(MyInteger.parseInt(chars));
		
		System.out.println("\nCasting string \"98765\" to an integer.");
		System.out.println(MyInteger.parseInt("98765"));

	}
}