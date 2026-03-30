# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        # step 1 intiqlize the heap with the first node of each list
        heap = []
        for i, node in enumerate(lists):
            if node:
                heapq.heappush(heap,(node.val, i, node))
        # step 2: create a dummy head and pointer to build result lists
        dummy = ListNode(0)
        current = dummy

        #step3 extrcact the smallest node and pus hthe next node from the same list
        while heap:
            val, i, node = heapq.heappop(heap)
            current.next = node
            current = current.next
            if node.next:
                heapq.heappush(heap, (node.next.val, i, node.next))

        return dummy.next