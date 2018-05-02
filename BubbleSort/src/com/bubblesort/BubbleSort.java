package com.bubblesort;

public class BubbleSort {
	
    public static void main(String[] args) {
        int swapCount = 0;
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
        int[] a = {1, 3, 6, 3, 8, 7};
        int n = a.length;
        int i = 0;
        boolean swapNeeded = true;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    swapNeeded = true;
                    swapCount++;
                }
            }
            if(!swapNeeded) {
                break;
            }
            i++;
        }
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }

}
