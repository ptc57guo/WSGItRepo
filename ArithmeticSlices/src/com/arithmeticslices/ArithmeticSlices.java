package com.arithmeticslices;

public class ArithmeticSlices {

	public static void main(String args[]) {
		int[] a = {-1, 1, 3, 3, 3, 2, 1, 0};
		System.out.println(numberOfArithmeticSlices(a));
	}
	
	public static int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length < 3)
            return 0;
        int totalNumberOfSlices = 0;
        int lengthOfSlice = 2;

        for( int i=2; i<A.length; i++ ) {

            if( A[i] - A[i-1] == A[i-1] - A[i-2] ) {
            		lengthOfSlice++;
            }
            else {
                if( lengthOfSlice > 2 ) {
                	totalNumberOfSlices += calculateSlices( lengthOfSlice );
                }
                lengthOfSlice = 2;
            }
        }
        if( lengthOfSlice>2 )
        		totalNumberOfSlices += calculateSlices( lengthOfSlice );

        return totalNumberOfSlices;
    }

    private static int calculateSlices( int lengthOfSlice ){
        return ( lengthOfSlice - 1 ) * ( lengthOfSlice - 2 ) / 2;
    }
}
