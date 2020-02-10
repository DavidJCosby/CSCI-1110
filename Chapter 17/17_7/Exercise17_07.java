/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rmazorow
 */

/*
    David Cosby
    02/06/2020
    Added a method to read Load objects from a file and adjusted the program to display the total loan amount.
*/
import java.io.*;
import java.util.ArrayList;



public class Exercise17_07 {
    
    public static void outputData(String fileName) {
        int total = 0;
        
        try (
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
        ) {
            boolean proceed = true;
            
            while (proceed) {
                try {
                    Loan loanFromFile = (Loan)input.readObject();
                    total += loanFromFile.getLoanAmount();
                }
                catch (EOFException e1) {
                    proceed = false;
                }
                catch (ClassNotFoundException e2) {
                    System.out.println("unrecognized class");
                    proceed = false;
                }
            }
            
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        
        System.out.println("Total loan amount: " + total);

    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        
        try (
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        
        outputData("Exercise17_07.dat");
    }
}
