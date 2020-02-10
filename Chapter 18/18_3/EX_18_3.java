/*
Author: David Cosby
Date: 2/10/2020

Prompts the user to enter two integers, then displays their GCD
*/

import java.util.Scanner;


public class EX_18_3 {
	
	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		else {
			return gcd(n, m%n);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer (a): ");
		int a = input.nextInt();
		
		System.out.print("Enter the second integer (b): ");
		int b = input.nextInt();
	
		System.out.println("gcd(a, b) = " + gcd(a, b));
	}
}