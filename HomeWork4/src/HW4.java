/**
 * File Name: HW4.java
 * @author maxwellstow & johnho
 *
 *Copyright (C) 2015 Maxwell Stow & John Ho
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

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
		System.out.println(txtFile);
		char[] rnaArray = new char[txtFile.length()];
		
		ArrayList<Integer> gList = new ArrayList<Integer>();
		ArrayList<Integer> cList = new ArrayList<Integer>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		ArrayList<Integer> uList = new ArrayList<Integer>();
		int counter = 0;

		while(counter < txtFile.length()) {
			char singleRNA = txtFile.charAt(counter);
			rnaArray[counter] = singleRNA;
			
			if(singleRNA == 'G') {
				gList.add(counter);
			}
			if(singleRNA == 'C') {
				cList.add(counter);
			}
			if(singleRNA == 'A') {
				aList.add(counter);
			}
			if(singleRNA == 'U') {
				uList.add(counter);
			}
			
		
			counter++;
		}
		int sizeOfAList = aList.size();
		int sizeOfCList = cList.size();
		int sizeOfGList = gList.size();
		int sizeOfUList = uList.size();
	
		System.out.println(sizeOfAList);
		System.out.println(sizeOfCList);
		System.out.println(sizeOfGList);
		System.out.println(sizeOfUList);
		
		String [][] auArray = new String[sizeOfAList][sizeOfUList];
		String [][] cgArray = new String[sizeOfCList][sizeOfGList];
		String [][] guArray = new String[sizeOfGList][sizeOfUList];
		String [][] uaArray = new String[sizeOfUList][sizeOfAList];
		String [][] gcArray = new String[sizeOfGList][sizeOfCList];
		String [][] ugArray = new String[sizeOfUList][sizeOfGList];		
		
		
		int aCounter = 0;
		int uCounter = 0;
		while (aCounter < sizeOfAList) {
			
			while (uCounter < sizeOfUList) {
				if(aList.get(aCounter) < uList.get(uCounter)) {
					auArray[aCounter][uCounter] = (aList.get(aCounter) + "," + uList.get(uCounter));
				} else {
					uaArray[uCounter][aCounter] = (uList.get(uCounter) + "," + aList.get(aCounter));
				}
				uCounter++;
			}
			aCounter++;
		}
		System.out.println(Arrays.deepToString(uaArray));
		System.out.println(Arrays.deepToString(auArray));
		
		fileInTxt.close();

	}
	
}
