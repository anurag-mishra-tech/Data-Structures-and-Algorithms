package com.datastructures;

public class LinkedListConstructor {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);		
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		
		//Test Append
		myLinkedList.append(2);
		
		System.out.println("\nLinked List:");
		myLinkedList.printList();

	}
}
