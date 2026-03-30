class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash_count = defaultdict(int)

        for num in nums:
            hash_count[num] += 1

            if hash_count[num] > 1:
                return True
        return False

    