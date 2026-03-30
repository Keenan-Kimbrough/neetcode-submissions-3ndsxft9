class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # loop through array and keep count in hashmap
        #create a dequeue ordered by highest count 
        # loop through there
        # then loop deque and get top k elements by k times

        count = {}
        for num in nums:
            count[num] = count.get(num,0) + 1
        
        buckets = [[] for _ in range(len(nums) + 1)]


        for num, freq in count.items():
            buckets[freq].append(num)

        res = []

        for freq in range(len(buckets) -1, 0, -1):
            for n in buckets[freq]:
                res.append(n)
                if len(res) == k:
                    return res

            