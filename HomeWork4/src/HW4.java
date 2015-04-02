/**
 * File Name: HW4.java
 * @author maxwellstow & johnho
 *
 *Copyright (C) 2015 Maxwell Stow & John Ho
 */

import java.util.Scanner;
import java.io.*;

public class HW4 {
	public static void main(String[] args) throws FileNotFoundException {
		
		/**
		 * Initializes a scanner to read a file and sets it as null
		 */
		
		Scanner fileInTxt = null;
		
		/**
		 * A Try Catch expression to read the file and set it to the path of the file text.txt
		 * If the file is not found it executes the catch statement.
		 */
		
		try {
			fileInTxt = new Scanner (new FileInputStream("DA0260.txt"));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		String txtFile = fileInTxt.next();
		
		char[] rnaArray = new char[75];
		
		int counter = 0;
		
		while(counter < 75) {
			char singleRNA = txtFile.charAt(counter);
			rnaArray[counter] = singleRNA;
			counter++;
		}
		
		fileInTxt.close();
	}
	
}
