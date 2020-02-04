/*
Author: David Cosby
Date: 02/04/2020

Uses PrintWriter to write 100 random integers to a text file "Exercise17_01.txt" if it does not already exist.
*/

import java.io.*;



class EX_17_1 {
	public static int randomInt(int floor, int ceil) {
		double seed = Math.random();
		return (int) (floor + (ceil-floor) * seed);
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_01.txt");
		
		if (!file.exists()) {
			try (PrintWriter output = new PrintWriter(file)) {
				for (int i = 0; i < 100; i++) {
					output.print(randomInt(-100, 100) + " ");
				}
			output.close();
			}
		}
	}
}