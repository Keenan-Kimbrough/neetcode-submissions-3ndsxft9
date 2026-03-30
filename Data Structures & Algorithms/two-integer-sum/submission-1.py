class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # calculate the recip
        #store values in hashmap key is number value is index
        hashmap = defaultdict()

        for index, num in enumerate(nums):
            #calc reci
            recip = target - num
            if recip in hashmap:
                return [hashmap[recip], index]
            hashmap[num] = index