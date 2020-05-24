package com.trees.practice;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStockOptimal {
	
	private int maxProfit (int[] prices) {
		
		int min = Integer.MAX_VALUE, max = 0;
	     for (int price: prices) {
	            min = Math.min(min, price);
	            max = Math.max(price - min, max);
	     }
		return max;
	}

	public static void main(String[] args) {
		
		BestTimeToBuyAndSellStockOptimal obj = new BestTimeToBuyAndSellStockOptimal();
		int prices[] = {12, 10, 4, 19, 3, 8};
		System.out.println(obj.maxProfit(prices));
		
		
	}

}
