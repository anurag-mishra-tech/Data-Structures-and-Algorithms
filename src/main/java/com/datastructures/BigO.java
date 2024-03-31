package com.datastructures;

/*O(n) is straight line
O(10) in below sample */
public class BigO {
	public static void BigOn(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		for (int j = 0; j < n; j++) {
			System.out.println(j);
		}
	}

	public static void BigOn2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i +" "+ j);
			}
		}
		
	}

	public static void main(String[] args) {
		//Big O(n) Examples
		System.out.println("Big O(n)-------------------------------------------");
		BigOn(10);
		System.out.println("Big O(n^2)-------------------------------------------");
		//Big O(n^2) Examples
		BigOn2(10);
	}
}
