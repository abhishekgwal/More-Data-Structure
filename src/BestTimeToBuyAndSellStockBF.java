package com.trees.practice;

public class BestTimeToBuyAndSellStockBF {
	
	private int maxProfit(int[] prices) {
        
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                
                int compare = prices[j] - prices[i];
                if (compare > 0 && compare > max)
                    max = compare;
            }
        }
        
        if (max > 0)
            return max; 
        else return 0;
        
    }

	public static void main(String[] args) {

		BestTimeToBuyAndSellStockBF obj = new BestTimeToBuyAndSellStockBF();
		int arr[] = {12, 10, 4, 19, 3, 8};
		int maxProfit = obj.maxProfit(arr);
		System.out.println(maxProfit);
		
	}

}
