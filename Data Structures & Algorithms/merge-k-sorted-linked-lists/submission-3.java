/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // edge case: no lists provided
        if ( lists.length == 0) return null;
        // min-heap to always get the smallest node among k
        // comparator ensures nodes are orded by value
        // a-b is ascending order having lower number at top
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> a.val - b.val);
        // step 1: add the head of each nonempty  lists to heap
        for(ListNode list:lists){
            if ( list !=null){
                minHeap.offer(list);// push into heap//
            }
        }
        // dummy node to simplicity result list construction
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        // step : process the heap until empty
        while(!minHeap.isEmpty()){
            // get the smallest node currently available
            ListNode node = minHeap.poll();
            // attach it to the result list
            cur.next = node;
            cur = cur.next;
            // if this node has a next, add it to the heap
            // this keeps one node from each list in the heap

            if(node.next != null){
                minHeap.offer(node.next);
            }
        }
        // return teh merged sorted lists ( skip dummy node)
        return dummy.next;
    }
}
