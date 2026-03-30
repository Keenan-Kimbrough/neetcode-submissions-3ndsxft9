class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        left,right = 0,0
        hash_set = set()
        max_count = 0
        


        while right < len(s):
            
            if s[right] in hash_set:
                hash_set.remove(s[left])
                left += 1
            else:
                hash_set.add(s[right])
                max_count = max(max_count, right - left + 1)
                
                right += 1
        
        return max_count

