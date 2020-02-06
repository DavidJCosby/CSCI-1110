/*
Author: David Cosby
Date: 02/06/2020

Takes any binary file and decrypts it by removing the 5 that is after each byte.
*/

import java.io.*;
import java.util.Scanner;

class EX_17_15 {
	// ints are 4 bytes
	public static void decryptFile(String from, String to) {
		int insertLengthInBytes = 4;
		
		try (
			DataInputStream input = new DataInputStream(new FileInputStream(from));
			DataOutputStream output = new DataOutputStream(new FileOutputStream(to));
		) {
			while (input.available() > 0) {
				output.writeByte(input.readByte());
				input.skip(insertLengthInBytes);
			}
			System.out.println("Done.");
		}
		catch (FileNotFoundException ex) {
			System.out.println("File \"" + from + "\" not found");
		}
		catch (IOException ex) {
			System.out.println("encountered an IOException");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name of the file to be decrypted: ");
		String inputName = input.next();
		
		System.out.print("Name for the output file: ");
		String outputName = input.next();

		decryptFile(inputName, outputName);
		input.close();
	}
}