
package com.ginurban.pd11;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * @author gintare
 * @version 1.0
 */
public class AlgorithmsPd11 {

	private static int[] numbers = new int [10]; //{66, 44, 110}; 

	public static void main(String[] args) {
		//fills array with random integers
		fillIntArray(numbers);

		System.out.println(Arrays.toString(numbers));

		//11.1 takes integer array as argument and finds Highest Common factor(HCF);
		System.out.println(findHCF(numbers));

		//11.2 takes integer array as argument and finds Lowest Common Multiple (LCM);
		//		System.out.println(findLCM(numbers)); //TODO optimise

		//11.3 takes integer array as an argument and returns the biggest possible number composed from the elements of the array
		//e.g. [2,45,6] -> 6452 
		System.out.println(findBiggestNumber(numbers));


		//11.4 add elements of two integer arrays
		int[] numbers2 = new int[5];
		fillIntArray(numbers2);
		System.out.println(Arrays.toString(numbers2));
		System.out.println(Arrays.toString(addIntArrays(numbers, numbers2)));

		//11.5 count how many times a specific word is repeated in a given text
		String text = "I scream, you scream, we all scream for ice cream. Is cream ice cream?";
		String searchWord = "cream";
		System.out.println(text);
		System.out.println(countWord (text, searchWord));
	}


	private static BigInteger findBiggestNumber(int[] numbers) {

		String resultString = "";
		int[] resultArray = new int[numbers.length];

		for (int i = 0; i < resultArray.length; i++) {
			// find element with highest first digit
			int maxElement = numbers[0];
			int maxIndex = 0;
			int maxLength = findLength(maxElement);
			for (int j = 1; j < numbers.length; j++) {
				//find shorter length between max element and number[j]
				int shorterLength = 0;
				if (findLength(numbers[j]) < maxLength) {
					shorterLength = findLength(numbers[j]);
				} else {
					shorterLength = maxLength;
				}

				int digitIndex = 0;
				for (int k = digitIndex; k < shorterLength; k++) {
					if (findDigit(numbers[j], k) > findDigit(maxElement, k)) {
						maxElement = numbers[j];
						maxLength = findLength(maxElement);
						maxIndex = j;
						break;
					} else if (findDigit(numbers[j], k) < findDigit(maxElement, k)) {
						break;
					}
					digitIndex = k;
				}
				// TODO additional check
				//if (findDigit(numbers[j], k+1) > findDigit(maxElement, k))
			}

			//assign the element with the highest fist digit to the result array
			resultArray[i] = numbers[maxIndex];

			//take the assigned element from numbers array
			int[] newNumbers = new int[numbers.length - 1];
			for (int k = 0, j = 0; k < numbers.length; k++) {
				if (k == maxIndex) {
					continue;
				} else {
					newNumbers[j] = numbers[k];
					j++;
				}
			}
			numbers = newNumbers;
		}

		StringBuilder builder = new StringBuilder();
		for (int number : resultArray) {
			builder.append(String.valueOf(number));
		}
		resultString = builder.toString();
		BigInteger result = new BigInteger(resultString);

		return result;
	}

	private static int findLength(int number) {
		int length = String.valueOf(number).length();
		return length;
	}

	private static int findDigit(int number, int index) {
		int digit = Integer.parseInt(Integer.toString(number).substring(0 + index,1 + index));
		return digit;
	}


	private static int countWord(String text, String searchWord) {
		int wordCounter = 0;

		StringTokenizer tokens = new StringTokenizer(text);
		//divide text into tokens
		while (tokens.hasMoreTokens()) {

			String word = tokens.nextToken();
			String tempWord = null;

			/*check is the first and/or last character in each token is some
			 *  character that is not a letter and crop them using tempString.
			 *  This is done in order to get rid of commas, question marks etc.
			 */
			int firstChar = word.charAt(0);
			int lastChar = word.charAt(word.length()-1);


			if (firstChar >= 32 && firstChar <= 64) {
				tempWord = word.substring(1);
				word = tempWord;
			}
			if (lastChar >= 32 && lastChar <= 64) {
				tempWord = word.substring(0, word.length() - 1);
				word = tempWord;
			}

			// compare the searchWord to each cropped token
			if (word.toLowerCase().equals(searchWord)) {
				wordCounter++;
			}
		}

		return wordCounter;
	}


	private static int[] addIntArrays(int[] numbers, int[] numbers2) {
		int newLength = 0;
		if (numbers.length > numbers2.length) {
			newLength = numbers.length;
		} else {
			newLength = numbers2.length;
		}

		int[] newNumbers = new int[newLength];

		//copy the first array into the new array
		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i];
		}
		//add second array elements to the first array elements which are already copied into the new array
		for (int j = 0; j < numbers2.length; j++) {
			newNumbers[j] = newNumbers[j] + numbers2[j];
		}
		return newNumbers;
	}


	private static int findLCM(int[] numbers) {
		//check if any of the elements is 0
		for (int number : numbers) {
			if (number == 0) {
				System.out.println("LCM for 0 does not exist.");
				return 0;
			}
		}

		//find greatest element in an array
		int greatestInt = numbers[0];
		int lcm = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > greatestInt) {
				greatestInt = numbers[i];
			}
		}

		//find LCM
		while(true) {		
			int factorCount = 0;
			int index = 0;
			while (index < numbers.length) {

				if (greatestInt % numbers[index] == 0) {
					factorCount++;
				}
				index++;
			}
			if (factorCount == numbers.length) {
				lcm = greatestInt;
				break;
			}
			greatestInt++; //optimise
		}
		return lcm;
	}


	private static int findHCF(int[] numbers) {
		//find smallest element in an array
		int smallestInt = numbers[0];
		int hcf = 1;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallestInt) {
				smallestInt = numbers[i];
			}
		}

		//find HCF
		for (int i = smallestInt; i > 0; i--) {
			int factorCount = 0;

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % i == 0) {
					factorCount++;
				}
			}

			//if all elements in an array are perfectly divisible by i, then i is hcf
			if (factorCount == numbers.length) {
				hcf = i;
				break;

			}
		}
		return hcf;
	}


	private static void fillIntArray(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			Random random = new Random();
			numbers[i] = random.nextInt(100);
		}

	}

}
