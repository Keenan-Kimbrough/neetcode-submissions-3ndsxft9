class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""
        count_t = {}
        window = {}
        # get count of char in string t
        for c in t:
            count_t[c] = count_t.get(c,0) + 1

        #start indices negative so that can easily be updated
        res = [-1,-1]
        # set res_len to infinity in order to update accordingly
        res_len = float("infinity")
        l = 0
        have, need = 0, len(count_t)

        for r in range(len(s)):
            char = s[r]
            window[char] = 1 + window.get(char,0)
            # if char in string s in t and is count of t equal to 
            #count of window needed

            if char in count_t and count_t[char] == window[char]:
                have += 1

            while have == need:
                # try to find a smaller substring
                if ((r - l + 1) < res_len):
                    #update result
                    res = [l,r]
                    res_len = r - l + 1
                # remove from left side window
                window[s[l]] -= 1
                # check to see if from removing from leftside 
                #changes count in window
                if s[l] in count_t and window[s[l]] < count_t[s[l]]:
                    have -= 1
                l += 1
             
        l,r = res
        return s[l:r+1] if res_len != float("infinity") else ""

        
        

