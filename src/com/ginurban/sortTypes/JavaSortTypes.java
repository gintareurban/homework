/**
 * 
 */
package com.ginurban.sortTypes;

import java.util.Random;

/**
 * @author gintare
 *
 */
public class JavaSortTypes {

	private static int[] intArray = new int[10000];

	public static void main(String[] args) {
		fillRandomArray(intArray);
		printArray(intArray);
		/* quickSort = quick, bubbleSort = bubble, selectionSort = selection, 
		 * insertionSort = insertion, mergeSort = merge
		 * with 10k elements execution time on current machine: merge - 54ms, quick - 41ms,
		 *  selection - 485ms, insertion - 672ms, bubble - 997ms 
		 */
		String sortType = "bubble";
		timer(sortType, intArray);
		printArray(intArray);



	}

	private static void timer(String sortType, int[] intArray) {
		long start = System.currentTimeMillis();

		switch(sortType) {
		case "quick":
			quickSort(intArray, 0, intArray.length -1);
			break;
		case "bubble":
			bubbleSort(intArray);
			break;
		case "selection":
			selectionSort(intArray);
			break;
		case "insertion":
			insertionSort(intArray);
			break;
		case "merge":
			mergeSort(intArray);
			break;
		default:
			System.out.println("Sort type does not exist");
		}

		long end = System.currentTimeMillis();
		System.out.println("Execution time for " + sortType + " sort is " + (end - start) + " ms \n");


	}
	

	private static int[] mergeSort(int[] intArray) {
		int length = intArray.length;
		if (length < 2) {
			return null;
		}
		
		int mid = length / 2;
		int [] left = new int[mid];
		int [] right = new int[length - mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = intArray[i];
		}
		for (int i = mid; i < length; i++) {
			right[i - mid] = intArray[i];
		}
		mergeSort(left);
		mergeSort(right);
		
		merge(intArray, left, right);
		
		return intArray;
	}

	private static int[] merge(int[] intArray, int[] left, int[] right) {
		int leftLength = left.length;
		int rightLength = right.length;
		
		int i = 0, j = 0, k = 0;
		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				intArray[k] = left[i];
				i++;
			} else {
				intArray[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < leftLength) {
			intArray[k] = left[i];
			k++;
			i++;
		}
		while (j < rightLength) {
			intArray[k] = right[j];
			k++;
			j++;
		}
		return intArray;
	}

	private static void insertionSort(int[] intArray) {
		// 
		for (int i = 1; i < intArray.length; i++) {
			int keyValue = intArray[i];
			int j = i - 1;
			while (j >= 0 && intArray[j] > keyValue) {
				intArray[j + 1] = intArray[j];
				j = j - 1;
			}
			intArray[j + 1] = keyValue;
		}
		
	}

	private static void selectionSort(int[] intArray) {
		//
		for (int i = 0; i < intArray.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < intArray[minIndex]) {
					minIndex = j;
				}
			}
			int temp = intArray[minIndex];
			intArray[minIndex] = intArray[i];
			intArray[i] = temp;
		}
	}

	private static int[] quickSort(int[] intArray, int start, int end) {
		
		// call partition method to find the index of pivot value 
		int partition = partitionIntArray(intArray, start, end);

		/*check if sub arrays to the left and right from partition index have more
		 *  than one element, if they do, call quick sort method recursively until all sub arrays
		 *  have one element on the left and/or right from the pivot value.
		 */
		if (partition - 1 > start) {
			quickSort(intArray, start, partition - 1);
		}
		if (partition + 1 < end) {
			quickSort(intArray, partition + 1, end);
		}

		return intArray;		
	}

	private static int partitionIntArray(int[] intArray, int start, int end) {
		/* assign the rightmost value in the array as the pivot value
		 * All elements less than the pivot value will be placed on the left of the pivot value
		 * All elements higher or equal to the pivot value get placed to the right side of the array
		 * Pivot value is at partition index, which is returned by this method
		 */
		int pivot = intArray[end];
		/*loop through array and swap values at start and i index in case
		 *  value at i index is smaller than the pivot value
		 */
		for (int i = start; i < end; i++) {
			if(intArray[i] < pivot) {
				int temp = intArray[start];
				intArray[start] = intArray[i];
				intArray[i] = temp;
				start++;
			}
		}
		/*at the end, swap the first greater than pivot value (which hasn't been swapped
		 *  in the loop) with the pivot value (which until now was at the end of the array);
		 */
		int temp = intArray[start];
		intArray[start] = pivot;
		intArray[end] = temp;
		// return the index at which pivot (or partition) value is placed
		return start;
	}


	private static int[] bubbleSort(int[] intArray) {

		int temp = 0;
		boolean swapped = false;
		for(int i = 0; i < intArray.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j+1]) {
					temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;	
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		return intArray;
	}


	private static void printArray(int[] intArray) {
		for (int number : intArray) {
			System.out.print(number + " ");
		}
		System.out.println();

	}


	private static int[] fillRandomArray(int[] intArray) {
		Random random = new Random();
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(1000);
		}
		return intArray;

	}

}
