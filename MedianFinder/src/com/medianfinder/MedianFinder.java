package com.medianfinder;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class MyMedianFinder {

    static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	 
	 
    // Adds a number into the data structure.
    public static void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
 
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
 
    // Returns the median of current data stream
    public static double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            addNum(a[a_i]);
            System.out.println(findMedian());
        }
    }
}