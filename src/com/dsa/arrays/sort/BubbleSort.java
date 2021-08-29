package com.dsa.arrays.sort;



/**
 * @author Anurag Mishra
 *
 *In bubble sort algorithm, array is traversed from first element to last element. 
 *Here, current element is compared with the next element. 
 *If current element is greater than the next element, it is swapped.
 */

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Program for Bubble Sort");
		int[] intArray = new int[8];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		intArray[7] = -23;

		for (int lastSortedIndex = intArray.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
			for (int i = 0; i < lastSortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}
			}
		}
		System.out.println("Output Array");
		for (int i : intArray) {
			System.out.println(i);
		}
	}

	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		System.out.println(array[i]+" and "+array[j]+" is swapped");
	}
}
