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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head == null ){
            return head;
        }
   
        ListNode temp = head;
        ListNode start = head;
        
        for(int i=0;i<n;i++){
            temp= temp.next;
        }
        
        if (temp == null) return head.next;
        
        while(temp.next !=null){
            temp=temp.next;
            start=start.next;
        }
       
        start.next = start.next.next;
        return head;
    }
}