'''
Created on Jul 22, 2018

@author: wshaklee
'''
from Node import Node


class Solution:

    head = Node(1)
    
    def __init__(self): 
        self.head = None
        
    # Create an iterator to parse through the nodes    
    def __iter__(self):
        node = s.head
        while node:
            yield node
            node = node.next 
               
    # This function is in LinkedList class
    # Function to insert a new node at the beginning
    def push(self, new_data):
 
        # Create a node and add the data
        new_node = Node(new_data)
         
        # Make the next of new Node as head
        new_node.next = self.head
         
        # Move the head to point to new Node 
        self.head = new_node
    
    # This function is in LinkedList class.
    # Inserts a new node after the given prev_node. 
    
    def insertAfter(self, prev_node, new_data):
 
        # Check if the given prev_node exists
        if prev_node is None:
            print "The given previous node must inLinkedList."
            return
 
        #  Create new node and add the data
        new_node = Node(new_data)
 
        # Make next of new Node as next of prev_node 
        new_node.next = prev_node.next
 
        # Make next of prev_node as new_node 
        prev_node.next = new_node
    
    # This function is defined in Linked List class
    # Appends a new node at the end. 
    def append(self, new_data):
 
        # Create a new node and add the data
        # Set next as None
        new_node = Node(new_data)
 
        # If the Linked List is empty, then make the
        #    new node as head
        if self.head is None:
            self.head = new_node
            return
 
        # Else traverse till the last node
        last = self.head
        while (last.next):
            last = last.next
 
        # Change the next of last node
        last.next =  new_node   
     
        
s = Solution()
s.push(2)
print [node.data for node in s]
s.append(3)
print [node.data for node in s]
s.insertAfter(s.head.next, 4)
print [node.data for node in s]
