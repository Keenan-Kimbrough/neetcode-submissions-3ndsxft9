class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
      if not nums:
        return 0
      hash_set = set(nums)

      longest_sequence = 1

      for num in nums:
        if num - 1 not in hash_set:

            current_max = 1
            current_num = num
            while current_num + 1 in hash_set:
                current_max += 1

                longest_sequence = max(longest_sequence, current_max)
                current_num += 1

      return longest_sequence
        
            