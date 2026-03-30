class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash_dict = defaultdict(int)

        for num in nums:
            if hash_dict[num] >= 1:
                return True
            
            hash_dict[num] += 1
        
        return False
        

    