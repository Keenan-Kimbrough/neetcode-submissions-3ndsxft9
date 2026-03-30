class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longest = 0

        distinct = set(nums)

        for num in nums:
            if num - 1 not in distinct:
                count = 1
                curr = num
                while curr + 1 in distinct:
                    count+= 1
                    
                    curr += 1
                longest = max(count,longest)
        return longest