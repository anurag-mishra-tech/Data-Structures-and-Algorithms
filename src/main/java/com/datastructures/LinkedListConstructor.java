package com.datastructures;

public class LinkedListConstructor {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);

		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();

		// Append
		myLinkedList.append(2);
		System.out.println("\nLinked List Append:");
		myLinkedList.printList();
		
		// Get
		System.out.println("\nLinked List Get:");
		System.out.println(myLinkedList.get(1).value);
		
		 
		// Prepend
		myLinkedList.prepend(4);
		System.out.println("\nLinked List Prepend:");
		myLinkedList.printList();

		// Remove First 3 cases
		System.out.println("\nLinked List Remove First: Start ");
		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList.removeFirst().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList.removeFirst().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList.removeFirst());
		System.out.println("Linked List Remove First: End");
		
		// Remove Last 3 cases
		System.out.println("\nLinked List Remove Last: Start ");
		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList.removeLast().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList.removeLast().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList.removeLast());
		System.out.println("Linked List Remove Last: End");

	}
}
