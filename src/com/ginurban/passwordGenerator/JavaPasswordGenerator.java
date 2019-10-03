package com.ginurban.passwordGenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class JavaPasswordGenerator {

	public static void main(String[] args) {
		//System.out.println(generatePassword(8));
				
		System.out.println(countDuplicatesInStringArray(buildStringArrayForPasswords(3000000, 8)));
		
	}


	private static int countDuplicatesInStringArray(String[] passwordArray) {
		/* Method takes a string array as the argument.
		 * Finds duplicates and calculates the execution time.
		 * Using hashset leads to a decrease in execution (by about 70% on current machine)
		 */
		
		
		long start = System.currentTimeMillis();
		int duplicates = 0;
		
		
		//method 1: long execution time
//		Arrays.sort(passwordArray);
//		for(int i = 1; i < passwordArray.length; i++) {
//			
//				if (passwordArray[i].equals(passwordArray[i-1])) {
//					duplicates++; 
//				}
//		}
		
		//method 2: using hashset
		Set<String> unique = new HashSet<String>();
		for (int i = 0; i < passwordArray.length; i++) {
			if(unique.contains(passwordArray[i])) {
				duplicates++;
			}else {
				unique.add(passwordArray[i]);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Counts duplicates in " + (end - start) + " ms \n");
		
		return duplicates;
	}



	private static String[] buildStringArrayForPasswords(int arrayLength, int passwordLength) {
		/* Method creates an empty string array using the specified length and
		 * calls generatePassword method to generate randomly created strings of specified length
		 */
		long start = System.currentTimeMillis();
		String[] passwordArray = new String[arrayLength];
		for(int i =0; i < arrayLength; i++) {
			passwordArray[i] = generatePassword(passwordLength);
		}
		long end = System.currentTimeMillis();
		System.out.println("Builds String Array in " + (end - start) + " ms \n");
		
		return passwordArray;
	}


	private static String generatePassword(int length) {
		/*Method takes length in number of characters as an argument and 
		 * uses Random and StringBuilder classes to generate a String of a specified length.
		 * The characters that can be used are specified in char array
		 */
		
		if (length < 1) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		char[] charArrayForPassword = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P','Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
				'1', '2', '3', '4', '5', '6', '7', '8', '9'
				//, '@', '%', '+', '-', '*', '/'
				//, '!', '#', '$', '^', '?', ':', ',', '(', ')', '[', ']', '{', '}', '_', '.'
				};

		for (int i = 0; i < length; i++) {
			builder.append(charArrayForPassword[random.nextInt(charArrayForPassword.length)]);
		}
		return builder.toString();
	}
}
