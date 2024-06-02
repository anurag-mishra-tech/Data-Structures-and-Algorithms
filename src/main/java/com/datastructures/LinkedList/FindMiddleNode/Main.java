package com.datastructures.LinkedList.FindMiddleNode;

/*In this problem, you should use the slow and fast pointer technique 
 * (also known as Floyd's Tortoise and Hare algorithm) to find the 
 * middle element of the linked list efficiently.
 * */
public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);

		System.out.println("1 -> 2 -> 3 -> 4 -> 5");
		System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);

		myLinkedList.append(6);

		System.out.println("===========================");
		System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
		System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);

	}

}