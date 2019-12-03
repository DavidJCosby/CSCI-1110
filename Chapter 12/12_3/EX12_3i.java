/*
Author: David Cosby
Date: 11/26/2019

Creates an array with 100 random integers and allows the user to read it by inputting an index.
*/

import java.util.Scanner;
import java.util.*;

class EX12_3i {
	public static int[] array = new int[100];
	
	public static int randomInt(int floor, int ceil) {
		double seed = Math.random();
		return (int) (floor + (ceil-floor) * seed); // interpolation formula  a+(b-a)t
	}
	
	public static void populateArray() {
		for (int i = 0; i < 100; i++) {
			array[i] = randomInt(-10000, 10000);
		}
	}
	
	public static void main(String[] args) {
		populateArray();
		boolean end = false;
		Scanner input = new Scanner(System.in);
		
		while (!end) {
			System.out.print("Enter an array index (0-99): ");
			try {
				int index = input.nextInt();
				int selectedValue = array[index];
				System.out.println("Array[" + index + "] = " + selectedValue);
				end = true;
			}
			catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("Out of Bounds.\n");
			}
			catch (InputMismatchException b) {
				System.out.println("Not an Integer.\n");
				input.next();
			}
		}
	}
}