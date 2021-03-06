/*
Author: David Cosby
Date: 11/12/2019

Custom "MyInteger" class with various static and non-static methods.
*/

public class MyInteger {
	public int value;
	
	MyInteger(int v) {
		value = v;
	}
	
	public int getValue() {
		return value;
	}
	
	public static boolean isEven(int v) {
		return (v%2 == 0);
	}
	
	public static boolean isOdd(int v) {
		return (v%2 == 1);
	}
	
	public static boolean isPrime(int v) {
		if (v == 0 || v == 1) {
			return false;
		}
		else {
			for (int i = 2; i < v; i++) {
				if (v%i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static boolean isEven(MyInteger v) {
		return isEven(v.getValue());
	}
		
	public static boolean isOdd(MyInteger v) {
		return isOdd(v.getValue());
	}
		
	public static boolean isPrime(MyInteger v) {
		return isPrime(v.getValue());
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public boolean equals(int v) {
		return (v == value);
	}
	
	public boolean equals(MyInteger v) {
		return equals(v.getValue());
	}
	
	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
	
	public static int parseInt(char[] chars) {
		String s = "";
		for (char c : chars) {
			s += c;
		}
		return parseInt(s);
	}
	

}
