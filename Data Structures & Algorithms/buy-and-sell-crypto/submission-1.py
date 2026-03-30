class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        l,r = 0,0

        for r in range(1, len(prices)):
            cur_profit = prices[r] - prices[l]
            # buy low sell high
            
            max_profit = max(max_profit,cur_profit)

            if prices[r] < prices[l]:
                l = r
        
        return max_profit

