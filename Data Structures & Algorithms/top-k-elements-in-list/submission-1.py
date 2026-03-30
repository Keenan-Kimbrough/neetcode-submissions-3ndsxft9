class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hash_set = defaultdict(int)

        for n in nums:
            hash_set[n] += 1
        
        sorted_keys = sorted(hash_set.keys(), key=lambda x: hash_set[x], reverse=True)
        res = []
        res = sorted_keys[0:k]
        return res 
            