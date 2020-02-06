/*
Author: David Cosby
Date: 02/06/2020

Takes any binary file and encrypts it by adding a 5 after every byte.
*/

import java.io.*;
import java.util.Scanner;

class EX_17_14 {
	// ints are 4 bytes
	public static void encryptFile(String from, String to) {
		int insertation = 5;
		
		try (
			DataInputStream input = new DataInputStream(new FileInputStream(from));
			DataOutputStream output = new DataOutputStream(new FileOutputStream(to));
		) {
			while (input.available() > 0) {
				output.writeByte(input.readByte());
				output.writeInt(insertation);
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
		
		System.out.print("Name of the file to be encrypted: ");
		String inputName = input.next();
		
		System.out.print("Name for the output file: ");
		String outputName = input.next();

		encryptFile(inputName, outputName);
		input.close();
	}
}