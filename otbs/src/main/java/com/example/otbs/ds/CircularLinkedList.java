package com.example.otbs.ds;

import com.example.otbs.model.Seat;

public class CircularLinkedList<T> {
	
	static Node start;
	 
    // Structure of a Node
    static class Node {
        Node next;
        Node prev;
        Seat seat;
    };
    public CircularLinkedList (){
    	
    }
    // Function to insert at the end
    public CircularLinkedList(int value) {
        // If the list is empty, create a single node
        // circular and doubly list
    	for(int i=65;i<70;i++) {
    		int seatno = 1;
    		for(int j=0;j<value;j++) {
    			if (start == null) {
    	            Node new_node = new Node();
    	            new_node.next = new_node.prev = new_node;
    	            start = new_node;
    	            new_node.seat.setRow((char)i);
    	            new_node.seat.setSeatno(seatno);
    	            new_node.seat.setStatus('A');
    	        }else {
    	        	// If list is not empty
    	        	 
    	            /* Find last node */
    	            Node last = (start).prev;
    	     
    	            // Create Node dynamically
    	            Node new_node = new Node();
    	            new_node.seat.setRow((char)i);
    	            new_node.seat.setSeatno(seatno);
    	            new_node.seat.setStatus('A');
    	     
    	            // Start is going to be next of new_node
    	            new_node.next = start;
    	     
    	            // Make new node previous of start
    	            (start).prev = new_node;
    	     
    	            // Make last previous of new node
    	            new_node.prev = last;
    	     
    	            // Make new node next of old last
    	            last.next = new_node;
    	        }
    			seatno++;
    		}
    	}
        
 
        
    }
    
    public void traverseForward() {
    	Node temp = start;
    	 
        System.out.printf(
            "\nTraversal in forward direction \n");
        while (temp.next != start) {
        	System.out.printf("%c%d ", temp.seat.getRow(),temp.seat.getSeatno());
            temp = temp.next;
        }
        System.out.printf("%c%d ", temp.seat.getRow(),temp.seat.getSeatno());
    }
    public void traverseBackward() {      
    	Node temp = start;
    	
        System.out.printf(
            "\nTraversal in reverse direction \n");
        Node last = start.prev;
        temp = last;
        while (temp.prev != last) {
            System.out.printf("%c%d ", temp.seat.getRow(),temp.seat.getSeatno());
            temp = temp.prev;
        }
        System.out.printf("%c%d ", temp.seat.getRow(),temp.seat.getSeatno());
    }
 
    /* Driver code*/
    public static void main(String[] args) {
        /* Start with the empty list */
    	CircularLinkedList cll = new CircularLinkedList(5);
 
        System.out.printf(
            "Created circular doubly linked list is: ");
        cll.traverseForward();
    }
}
