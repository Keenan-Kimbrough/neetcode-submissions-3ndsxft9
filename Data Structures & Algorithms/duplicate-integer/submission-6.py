class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashset = defaultdict(int)
        
        for num in nums:
            hashset[num] += 1

            if hashset[num] > 1:
                return True

        
        return False