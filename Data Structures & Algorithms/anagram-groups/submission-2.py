class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash_list = defaultdict(list)

        for s in strs:
            hash_list[tuple(sorted(s))].append(s)
        
        return hash_list.values()

        