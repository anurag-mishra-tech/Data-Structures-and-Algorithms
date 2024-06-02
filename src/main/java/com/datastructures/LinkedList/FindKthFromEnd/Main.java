package com.datastructures.LinkedList.FindKthFromEnd;

/*This algorithm uses the two-pointer technique to 
 * efficiently find the k-th node from the end of the linked list.
 * */
public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 3;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        /*
            EXPECTED OUTPUT:
            ----------------
            4
            
        */
        
    }
    
}