package com.dsa.arrays.sort;

import java.util.Arrays;
import java.util.Iterator;

public class SortArrays {
	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 30;
		intArray[2] = 40;
		intArray[3] = 50;
		intArray[4] = 60;
		intArray[5] = 70;
		intArray[6] = 80;
		
		int index = 0;
		for (int i = 0; i < intArray.length; i++) {
			
			if (intArray[i] == 40) {
				index = i;
				break;
			}
		
		}
		System.out.println(index);
		
		
	}
}
