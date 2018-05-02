package com.addnode;

public class AddNode {

	public static  Node insert(Node head,int data) {
        Node ret = head;

       // check base case, header is null.
       if (head == null) {
           return new Node(data);
       }

       // loop until we find the end of the list
       while ((head.next != null)) {
           head = head.next;
       }

       // set the new node to the Object x, next will be null.
       head.next = new Node(data);
       return ret;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
        Node head = null;
//        int N = sc.nextInt();
        int[] data = {2, 3, 4, 1};
        for (int i = 0; i < data.length; i++) {
        		head = insert(head, data[i]);
        }
//        while(N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head,ele);
//        }
        display(head);
//        sc.close();
    }
}
