class Solution:
    def maxProfit(self, prices: List[int]) -> int:
      
        # buy low sell high

        maxProfit = 0

        l = 0
        r = 1
        while r < len(prices):
            if prices[l] < prices[r]: # if lower buy higher sell
                profit = prices[r] - prices[l]
                maxProfit = max(maxProfit,profit)
            else:
                l = r
            r += 1

        return maxProfit
        


            
                
