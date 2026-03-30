class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash_set = defaultdict(int)

        for i, num in enumerate(nums):
            recip = target - num
            if recip in hash_set:
                return [hash_set[recip], i]
            
            hash_set[num] = i
        
        return False
    
        