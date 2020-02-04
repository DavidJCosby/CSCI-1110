/*
Author: David Cosby
Date: 02/04/2020

Uses DataOutputStream to write 100 random integers to a binary .dat file "Exercise17_03.dat" if it does not already exist. Then reads those integers back from the file and finds the sum of all the integers.

Sorry if the organization of this one is a little bit weird, I'm trying to put the Single Responsibility Principle into practice here to help me understand it better.
*/

import java.io.*;
import java.util.ArrayList;



class EX_17_3 {
	
	public static int[] randomIntArray(int size) {
		RandomNumberGenerator rand = new RandomNumberGenerator();
		
		int[] returnArray = new int[size];
		for (int i = 0; i < size; i++) {
			returnArray[i] = rand.generateBetween(-100, 100);
		}
		
		return returnArray;
	}
	
	public static int sumOfIntegers(ArrayList<Integer> integers) {
		int sum = 0;
		
		for (int i : integers) {
			sum += 0;
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("EX_17_3.dat");
		
		if (!file.exists()) {
			BinaryIntegerWriter writer = new BinaryIntegerWriter(file);
			writer.writeIntList(randomIntArray(100));
		}
		
		BinaryIntegerReader reader = new BinaryIntegerReader(file);
		ArrayList<Integer> integers = reader.readIntList();
		
		System.out.println(sumOfIntegers(integers));
	}
}