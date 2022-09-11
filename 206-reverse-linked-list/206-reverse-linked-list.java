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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode curr  = head;
        ListNode pre = null;
       while(curr != null){
           ListNode ocr = curr.next;
           curr.next = pre;
           pre = curr;
           curr = ocr;
           
       } 
        
        return pre;
    }
}