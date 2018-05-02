package com.stockmaimumprofit;

public class StockMaximumProfit {

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
    
    public static void main(String args[]) {
    		int [] prices = {24, 36, 24, 35, 85, 40, 27, 51, 44, 20};
    		System.out.println("max profit for today is " + maxProfit(prices));
    }
}
