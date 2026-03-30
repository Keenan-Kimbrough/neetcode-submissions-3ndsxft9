class Solution:
    def trap(self, height: List[int]) -> int:
        # we'll check each position seperately
        n = len(height)
        total_water = 0

        for i in range(n):
            if i == 0 or i == n-1:
                continue

            left_max = height[i]
            for l in range( i, -1, -1):
                if height[l] > left_max:
                    left_max = height[l]

            right_max = height[i]

            for r in range(i,n):
                if height[r] > right_max:
                    right_max = height[r]

            water = min(left_max, right_max) - height[i]
            if water > 0:
                total_water += water
        return total_water