class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # i,j,k are distinct, so have to skip duplicates
        #output shouldn't have duplocates
        # need a negative number in there since it neds to equal =

        # loop throurgh nums, sort it if num is greater than - conitunue
        nums.sort()
        res = []

        for i, num in enumerate(nums):
            if num > 0:
                break

            if i > 0 and num == nums[i-1]:# skips duplicates
                continue

            l,r = i+1, len(nums) - 1
            while l < r:
                threeSum = num + nums[l] + nums[r]
                if threeSum > 0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    res.append([num,nums[l],nums[r]])
                    l+= 1
                    r -= 1
                    while nums[l] == nums[l-1] and l < r:
                        l+= 1
        return res
    