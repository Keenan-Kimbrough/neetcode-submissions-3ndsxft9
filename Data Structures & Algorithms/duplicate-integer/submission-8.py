class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash_map = defaultdict(int)

        for num in nums:
            hash_map[num] += 1

            if hash_map[num] > 1:
                return True
        return False
        

    