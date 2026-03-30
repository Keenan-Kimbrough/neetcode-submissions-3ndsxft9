class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int l = 0;
        int r = 1;

        while (r < prices.length){

            if (prices[r]> prices[l]){
            int currenProfit = prices[r] - prices[l];
            maxProfit = Math.max(maxProfit,currenProfit);

            } else{
                l = r;
            }
            r++;
                
            
        }
        return maxProfit;
    }
}
