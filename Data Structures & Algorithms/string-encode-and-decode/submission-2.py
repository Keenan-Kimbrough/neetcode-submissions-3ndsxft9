class Solution:

    def encode(self, strs: List[str]) -> str:
        s =""
        for string in strs:
            s+= str(len(string))+ "#" + string
        return s
    def decode(self, s: str) -> List[str]:
        i = 0
        res = []

        while i < len(s):
            j = i
            while s[j] != "#":
                j += 1 

            length = int(s[i:j]) # start 

            word = s[j+1: j+1+length]
            res.append(word)
            #j+1 would be first letter of word
            i = j + 1 + length

        return res