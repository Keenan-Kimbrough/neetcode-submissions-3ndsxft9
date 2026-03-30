class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = defaultdict(list)

        for s in strs:
            key = tuple(sorted(s))
            hashmap[key].append(s)
        
        output = list(hashmap.values())

        return output