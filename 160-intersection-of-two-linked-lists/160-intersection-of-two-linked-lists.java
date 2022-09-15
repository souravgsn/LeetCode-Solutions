/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow = headA;
        ListNode fast = headB;
        while(slow != fast){
            if(slow == null){
                slow=headA;
            }else slow = slow.next;
            
           if(fast == null){
                fast=headB;
            }else fast = fast.next;
            
        }
        return slow;
    }
}