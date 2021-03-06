package com.dsa.arrays.sort;


/**
 * @author Anurag Mishra
 *
 *The selection sort algorithm sorts an array by repeatedly finding the minimum element 
 *(considering ascending order) from unsorted part and putting it at the beginning. 
 *The algorithm maintains two subarrays in a given array.
 *1) The subarray which is already sorted. 
 *2) Remaining subarray which is unsorted.
 *In every iteration of selection sort, the minimum element (considering ascending order) 
 *from the unsorted subarray is picked and moved to the sorted subarray. 
 *
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("Program for Selection Sort");
		int[] intArray = new int[8];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		intArray[7] = -23;
		
		for (int lastunsortedindex = intArray.length - 1 ; lastunsortedindex > 0 ; lastunsortedindex-- ) {
			int largest = 0 ;
			
			for (int i = 0; i <= lastunsortedindex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			
			swap(intArray, largest, lastunsortedindex);
		}
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
