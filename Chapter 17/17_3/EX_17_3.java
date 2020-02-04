/*
Author: David Cosby
Date: 02/04/2020

Uses DataOutputStream to write 100 random integers to a binary .dat file "Exercise17_03.dat" if it does not already exist. Then reads those integers back from the file and finds the sum of all the integers.

Sorry if the organization of this one is a little bit weird, I'm attempting to put SOLID design principles into practice here to help me understand them better.
*/

import java.io.*;
import java.util.ArrayList;



class EX_17_3 {
	
	public static ArrayList<Integer> createRandomIntegerList(int size) {
		RandomIntegerGenerator rand = new RandomIntegerGenerator();
		
		ArrayList<Integer> returnArray = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			returnArray.add(rand.generateBetween(-100, 100));
		}
		return returnArray;
	}
	
	public static int sumOfIntegers(ArrayList<Integer> integers) {
		int sum = 0;
		for (int i : integers) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("EX_17_3.dat");
		
		if (!file.exists()) {
			BinaryIntegerListWriter writer = new BinaryIntegerListWriter(file);	
			writer.writeIntegerList(createRandomIntegerList(100));
		}
		
		BinaryIntegerListReader reader = new BinaryIntegerListReader(file);	
		System.out.println(sumOfIntegers(reader.readIntegerList()));
	}
}