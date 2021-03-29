class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
//        for(int i=0; i<prices.length; i++) {
//            for(int j=i+1; j<prices.length; j++) {
//                int profitComaprable = prices[j] - prices[i];
//                if(profitComaprable <= 0) continue;
//                if(maxProfit < profitComaprable) {
//                    maxProfit = profitComaprable;
//                }
//            }
//        }
//        return maxProfit;
    }
}