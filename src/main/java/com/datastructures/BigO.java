package com.datastructures;

/*O(n) is straight line
O(10) in below sample */
public class BigO {
	public static void BigOn(int n) {
		// O(n)
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
		// O(2n) >> O(n) >> Drop Constants
		System.out.println("-------------------");
		for (int j = 0; j < n; j++) {
			System.out.println(j);
		}
	}

	// O(n*2)
	public static void BigOn2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i + " " + j);
			}
		}

	}

	// O(n*2 + n) >> Drop Non Dominant >> O(n*2)
	public static void BigOn2Plusn(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i + " " + j);
			}
		}

	}

	// only 1 operation >> O(1) >> Most efficient way to solve problems
	public static int BigO1(int n) {
		return n + n; // 0(1) //return n + n + n ; 0(2)

	}

	private static void BigODifferentTerms(int a, int b) {
		// O(a + b) Examples
		// O(a)
		for (int i = 0; i < a; i++) {
			System.out.println(i);
		}
		// O(b)
		System.out.println("-------------------");
		for (int j = 0; j < b; j++) {
			System.out.println(j);
		}

		// O(a * b) Examples
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println(i+" "+j);
			}
		}
	}

	public static void main(String[] args) {
		// Big O(n) Drop Constants Examples
		System.out.println("Big O(n)-------------------------------------------");
		BigOn(10);

		System.out.println("Big O(n^2)-------------------------------------------");
		// Big O(n^2) Examples
		BigOn2(10);

		System.out.println("Big O(n^2 + n ) -------------------------------------------");
		// Big O(n^2 + n ) Drop Non Dominant Examples
		BigOn2Plusn(10);

		System.out.println("Big O(n^2)-------------------------------------------");
		// Big O(1) Examples
		BigO1(10);
		
		System.out.println("Big O(a+b) && Big O (a*b)-------------------------------------------");
		//O(a + b) && O(a * b)
		BigODifferentTerms(10, 11);

		System.out.println("Big O(a+b) && Big O (a*b)-------------------------------------------");
		//O(a + b) && O(a * b)
		BigODifferentTerms(10, 11);

	}

}
