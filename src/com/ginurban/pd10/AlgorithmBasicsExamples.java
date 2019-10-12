package com.ginurban.pd10;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

/**
 * @author gintare
 * @version 1.2
 */
public class AlgorithmBasicsExamples {


	public static void main(String[] args) {
		//10.1 create an int array based on given length, fill it with random ints and sort elements asc
//		createAndSortRandomIntArray(120);

		//10.2.1 find a specified term in Fibonacci sequence in under 5 secs
//		findFibonacciTerm(120);

		//10.2.2 create two sorted Array from random integers, find largest values and calculate the average
//		findAverageForMaxValuesOfTwoArrays();

		//10.3 taking the length of an array and the length of an element as arguments, method creates
		//an array from random chars added to strings and sorts it
		createAndSortRandomStringArray(10, 8);  
		

		//10.4 create an array of type Long containing a specified number of elements (i.e. 50k) and implement quick sort method
//		createAndQuickSortLongArray(50000);
	}



	private static void createAndQuickSortLongArray(int arrayLength) {

		//initialize a variable to capture the start time of the method
		long start = System.currentTimeMillis();

		// initialize empty array based on length
		long[] longArray = new long[arrayLength];

		// generate random long numbers and assign to array elements
		Random random = new Random();
		for(int i = 0; i < arrayLength; i++) {
			longArray[i] = random.nextLong();
		}
		//System.out.println(Arrays.toString(longArray));

		//Arrays.sort(longArray); //regular sort

		// quick sort method with 50k elements cuts sort time roughly by half
		quickSortLongArray(longArray, 0, longArray.length -1); // call quick sort method to partition and sort the array

		//System.out.println(Arrays.toString(longArray));

		//initialize a variable to capture the end time of the method
		long end = System.currentTimeMillis();

		//print out the execution time of the method in ms
		System.out.printf("Creates and sorts Long Array with %d elements in %d ms", arrayLength, (end - start));

	}


	private static long[] quickSortLongArray(long[] longArray, int start, int end) {

		// call partition method to find the index of pivot value 
		int partition = partitionLongArray(longArray, start, end);

		/*check if sub arrays to the left and right from partition index have more
		 *  than one element, if they do, call quick sort method recursively until all sub arrays
		 *  have one element on the left and/or right from the pivot value.
		 */
		if (partition - 1 > start) {
			quickSortLongArray(longArray, start, partition - 1);
		}
		if (partition + 1 < end) {
			quickSortLongArray(longArray, partition + 1, end);
		}

		return longArray;
	}


	private static int partitionLongArray(long[] longArray, int start, int end) {

		/* assign the rightmost value in the array as the pivot value
		 * All elements less than the pivot value will be placed on the left of the pivot value
		 * All elements higher or equal to the pivot value get placed to the right side of the array
		 * Pivot value is at partition index, which is returned by this method
		 */
		long pivot = longArray[end];
		/*loop through array and swap values at start and i index in case
		 *  value at i index is smaller than the pivot value
		 */
		for (int i = start; i < end; i++) {
			if(longArray[i] < pivot) {
				long temp = longArray[start];
				longArray[start] = longArray[i];
				longArray[i] = temp;
				start++;
			}
		}
		/*at the end, swap the first greater than pivot value (which hasn't been swapped
		 *  in the loop) with the pivot value (which until now was at the end of the array);
		 */
		long temp = longArray[start];
		longArray[start] = pivot;
		longArray[end] = temp;
		// return the index at which pivot (or partition) value is placed
		return start;
	}



	private static void createAndSortRandomStringArray(int arrayLength, int elementLength ) {

		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P','Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};
		String[] stringArray = new String[arrayLength];

		for(int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < elementLength; j++) {
				builder.append(charArray[random.nextInt(charArray.length)]);
			}
			stringArray[i] = builder.toString();
			builder.setLength(0);
		}

		//print unsorted array, sort the array and print sorted array
		System.out.println(Arrays.toString(stringArray));
		
		sortString(stringArray);
		System.out.println(Arrays.toString(stringArray));

	}



	private static String[] sortString(String[] stringArray) {
		
		String temp = null;
		boolean swapped = false;
		
		for(int i = 0; i < stringArray.length - 1; i++) {
			swapped = false;
			
			for (int j = 0; j < stringArray.length - 1 - i; j++) {
				int shortLength = 0;
				if (stringArray[j].length() > stringArray[j+1].length()) {
					shortLength = stringArray[j+1].length();
				} else {
					shortLength = stringArray[j].length();
				}
				
				//loop through the letters in adjacent strings, compare after converting to lowercase
				for (int k = 0; k < shortLength; k++) {
					int firstChar = stringArray[j].toLowerCase().charAt(k);
					int secondChar = stringArray[j+1].toLowerCase().charAt(k);
										
					if (firstChar == secondChar) {
						continue;
					} else if (firstChar < secondChar) {
						break;
					} else if (firstChar > secondChar) {
						temp = stringArray[j];
						stringArray[j] = stringArray[j+1];
						stringArray[j+1] = temp;
						swapped = true;
						break;
					}
				}
			}
						
			if (swapped == false) {
				break;
			}
		}
		return stringArray;
	}



	private static void findAverageForMaxValuesOfTwoArrays() {

		// call createAndSortRandomIntArray(int arrayLength) method to create two sorted Arrays
		int[] arrayOne = createAndSortRandomIntArray(30);
		int[] arrayTwo = createAndSortRandomIntArray(25);

		//assign the last element of each sorted array as a maxValue
		int maxValueOne = arrayOne[arrayOne.length - 1];
		int maxValueTwo = arrayTwo[arrayTwo.length - 1];

		//calculate average of max Values
		double averageOfMaxVal = (maxValueOne + maxValueTwo)/2;
		System.out.printf("Average of %d and %d is %.4f", maxValueOne, maxValueTwo, averageOfMaxVal);
		System.out.println("\n");
	}



	private static void findFibonacciTerm(int fibonacciTerm) {

		//initialize a variable to capture the start time of the method
		long start = System.currentTimeMillis();
		/* initialize variables to capture the (n-2) and (n-1) term values in Fibonacci
		 * sequence, assign 0 and 1 which are known terms at 0 position and 1st position
		 */
		BigInteger term0 = new BigInteger("0"); 
		BigInteger term1 = new BigInteger("1"); 
		BigInteger termN = new BigInteger("0");

		//check if the term specified is valid, i.e. non negative
		if (fibonacciTerm < 0) {
			System.out.println("Please enter a positive number");
			//print out '0' if term at position 0 is specified
		} else if (fibonacciTerm == 0) {
			//print out '1' if term at position 1 is specified
			System.out.printf("%d term in Fibonacci sequence is %d \n", fibonacciTerm, term0);
		} else if (fibonacciTerm == 1) {
			System.out.printf("%d term in Fibonacci sequence is %d \n", fibonacciTerm, term1);
		} else {
			/* if the term specified is 2 or more, calculate Fibonacci sequence
			 *  value by adding up the known values and reassigning to termN variable
			 *  as many times as is required to reach the specified term
			 */
			for (int i = 2; i <=fibonacciTerm; i++) {
				termN = term0.add(term1);
				term0 = term1;
				term1 = termN;
			}
			System.out.printf("%d term in Fibonacci sequence is %d \n", fibonacciTerm, termN);
		}

		//initialize a variable to capture the end time of the method
		long end = System.currentTimeMillis();
		//print out the execution time of the method in ms
		System.out.println("Finds Fibonacci term in " + (end - start) + " ms \n");
	}



	private static int[] createAndSortRandomIntArray(int arrayLength) {

		// initialize empty array based on length
		int[] intArray = new int[arrayLength];
		// generate random integers and assign to array elements
		Random random = new Random();
		for(int i = 0; i < arrayLength; i++) {
			intArray[i] = random.nextInt(1000);
		}

		//print out the generated array
		System.out.println(Arrays.toString(intArray));

		// apply sort
		Arrays.sort(intArray);

		//print out sorted array
		System.out.println(Arrays.toString(intArray));

		System.out.println();
		return intArray;
	}

}
