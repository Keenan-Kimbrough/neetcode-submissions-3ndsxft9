class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""
        count_t = {}
        window = {}

        for c in t:
            count_t[c] = count_t.get(c,0) + 1


        res = [-1,-1]
        res_len = float("infinity")
        l = 0
        have, need = 0, len(count_t)

        for r in range(len(s)):
            char = s[r]
            window[char] = 1 + window.get(char,0)

            if char in count_t and count_t[char] == window[char]:
                have += 1

            while have == need:
                if ((r - l + 1) < res_len):
                    res = [l,r]
                    res_len = r - l + 1
                window[s[l]] -= 1
                if s[l] in count_t and window[s[l]] < count_t[s[l]]:
                    have -= 1
                l += 1
             
        l,r = res
        return s[l:r+1] if res_len != float("infinity") else ""

        
        

