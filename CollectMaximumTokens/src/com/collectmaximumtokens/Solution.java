package com.collectmaximumtokens;

public class Solution {

    //returns the max value of 3 integers
    private static int maxCoins(int x, int y, int z)
    {
        if (x > y)
            return (x > z)? x : z;
        else
            return (y > z)? y : z;
    }

    private static int findMaxCoins(int cost[][], int m, int n)
    {
        int i, j;
        int totalCoins[][]=new int[m+1][n+1];
 
        totalCoins[0][0] = cost[0][0];
 
        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
        		totalCoins[i][0] = totalCoins[i-1][0] + cost[i][0];
 
        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
        		totalCoins[0][j] = totalCoins[0][j-1] + cost[0][j];
 

        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
            		totalCoins[i][j] = maxCoins(totalCoins[i-1][j-1], 
            						totalCoins[i-1][j],
            						totalCoins[i][j-1]) + cost[i][j];

        return totalCoins[m][n];
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3, 12},
                       {4, 8, 2, 14},
                       {1, 5, 3, 21},
                       {14, 12, 6, 7}};
        System.out.println("maximum coins to (3,3) = " +
                                         findMaxCoins(cost,3,3));
    }
}

