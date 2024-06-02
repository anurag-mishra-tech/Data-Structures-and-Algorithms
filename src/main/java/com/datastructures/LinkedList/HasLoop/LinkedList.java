package com.datastructures.LinkedList.HasLoop;

public class LinkedList {

	private Node head;
	private Node tail;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (head == null) {
			System.out.println("Head: null");
			System.out.println("Tail: null");
		} else {
			System.out.println("Head: " + head.value);
			System.out.println("Tail: " + tail.value);
		}
		System.out.println("\nLinked List:");
		if (head == null) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void makeEmpty() {
		head = null;
		tail = null;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public boolean hasLoop() {
		// Initialize slow pointer to the head of the linked list
		Node slow = head;

		// Initialize fast pointer to the head of the linked list
		Node fast = head;

		// Traverse the linked list with two pointers: slow and fast
		// slow moves one node at a time, while fast moves two nodes at a time
		while (fast != null && fast.next != null) {
			// Move slow pointer to the next node
			slow = slow.next;

			// Move fast pointer to the next two nodes
			fast = fast.next.next;

			// If slow pointer meets fast pointer, then there is a loop in the linked list
			if (slow == fast) {
				return true;
			}
		}

		// If the loop has not been detected after the traversal, then there is no loop
		// in the linked list
		return false;
	}

}
