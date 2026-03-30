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
    public ListNode reverseKGroup(ListNode head, int k) {
        // create a dumy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // prevGroupENd points ot he node before the group to reverse
        ListNode prevGroupEnd = dummy;

        while (true){
            ListNode kth = prevGroupEnd;
            for ( int i = 0; i < k && kth != null; i++){
                kth = kth.next;
            }
            // if there are fewer than k nodes left, break
            if(kth == null) break;

            // Mark the start and end of the group
            ListNode groupStart = prevGroupEnd.next;
            ListNode groupNext = kth.next;

            // Reverse the group

            ListNode prev = groupNext;
            ListNode curr = groupStart;
            while (curr != groupNext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;

        }

       return dummy.next; 
    }
}
