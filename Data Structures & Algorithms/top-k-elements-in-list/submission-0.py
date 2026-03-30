class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_count = Counter(nums).most_common()
        out_put = []
        for n, count in freq_count:
            out_put.append(n)

        most_freq = k
        out_put = out_put[:k]

        return out_put
