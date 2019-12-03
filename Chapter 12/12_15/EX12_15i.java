/*
Author: David Cosby
Date: 11/26/2019

If Exercise12_15.txt doesn't exist, it will write 100 random integers to it. Another method will print the integers in Exercise12_15.txt after sorting them into ascending order.
*/


import java.io.*;
import java.util.*;


class EX12_15i {

	public static File createFileAndPopulateWithIntegers(String fileName) throws IOException {
		File file = new File("Exercise12_15.txt");
		
		if (!file.exists()) {
			try (PrintWriter output = new PrintWriter(file)) {
				for (int i = 0; i < 100; i++) {
					output.print(randomInt(-100, 100) + " ");
				}
			}
		}
		
		return file;
	}
	
	
	public static int randomInt(int floor, int ceil) {
		double seed = Math.random();
		return (int) (floor + (ceil-floor) * seed); // interpolation formula  a+(b-a)t
	}
	
	
	public static ArrayList<Integer> packFileContentsIntoArrayList(File file) throws IOException {
		ArrayList<Integer> contents = new ArrayList<Integer>();
		
		try (Scanner input = new Scanner(file)) {
			while (input.hasNextInt()) {
				contents.add(input.nextInt());
			}
		}
		
		return contents;
	}
	
	
	public static void readArrayList(ArrayList<Integer> list) {
		for (int value : list) {
			System.out.print(value + " ");
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		File file = createFileAndPopulateWithIntegers("Exercise12_15.txt");
		ArrayList<Integer> fileContents = packFileContentsIntoArrayList(file); 
		Collections.sort(fileContents);			
		readArrayList(fileContents);
	}
}