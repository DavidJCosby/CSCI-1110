/*
Author: David Cosby
Date: 2/10/2020

Uses recursion to reverse a string.
*/

class EX_18_9 {

	public static String reverseAIntoB(String a, String b) {
		if (a.length() == 0) {
			return b;
		}
		else {
			b = b + a.substring(a.length()-1);
			a = a.substring(0, a.length()-1);
			return reverseAIntoB(a, b);
		}
	}

	public static void reverseDisplay(String value) {
		System.out.println(reverseAIntoB(value, ""));
	}

	public static void main(String[] args) {
		reverseDisplay("The quick brown fox jumps over the lazy dog.");
	}
}