package com.linkedlist;

public class Solution {
	static Node head;  // head of list
	
	public void push(int new_data)
	{
	    //Allocate the Node and add the data
	    Node new_node = new Node(new_data);
	 
	    // Make next of new Node as head 
	    new_node.next = head;
	 
	    // Move the head to point to new Node 
	    head = new_node;
	}
	
	   // Inserts a new node after the given prev_node. 
	public void insertAfter(Node prev_node, int new_data)
	{
	    // Check if the given Node is null 
	    if (prev_node == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	 
	    // Allocate the Node and add the data
	    Node new_node = new Node(new_data);
	 
	    // Make next of new Node as next of prev_node 
	    new_node.next = prev_node.next;
	 
	    // Make next of prev_node as new_node 
	    prev_node.next = new_node;
	}
	
	public void append(int new_data)
	{
	    // Allocate the Node and add the data
	    // Set next as null 
	    Node new_node = new Node(new_data);
	 
	    // If the Linked List is empty, then make the
	    //       new node as head 
	    if (head == null)
	    {
	        head = new Node(new_data);
	        return;
	    }
	 
	    // This new node is going to be the last node, so
	    //     make next of it as null 
	    new_node.next = null;
	 
	    // Else traverse till the last node 
	    Node last = head; 
	    while (last.next != null)
	        last = last.next;
	 
	    // Change the next of last node 
	    last.next = new_node;
	    return;
	}
	
	// Used to print the value of each node
	public void Print(Node head) {
		// If the list is empty return
	    if (head == null){
	        return;
	    }
	    Node node = head;
	    // Loop through the nodes and print the value
	    while(true){
	        System.out.print(node.data + " ");
	        if (node.next != null){
	            node = node.next;
	        }
	        else {
	            break;
	        }
	    }
	  
	}
	public static void main(String[] args) {
		System.out.println("--------Starting Solution--------");
		//Node new_node = new Node(2);
		Solution s = new Solution();
		System.out.println("------ new Solution --------");
		s.push(2);
		s.Print(head);
		System.out.println("-----------");
		s.append(3);
		s.Print(head);
		System.out.println("=---------");
		s.insertAfter(head.next, 4);
		s.Print(head);
		
	}
}
