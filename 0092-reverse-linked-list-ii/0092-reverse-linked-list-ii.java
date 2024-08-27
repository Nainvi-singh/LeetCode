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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy =new ListNode();
        dummy.next  =head;
        ListNode previous=dummy;
        for(int j=0;j<left-1;j++){
            previous=previous.next;
        }
        ListNode current=previous.next;
        for(int i=0;i<right-left;i++){
            ListNode next=current.next;
            current.next=next.next;
            next.next=previous.next;
            previous.next=next;
        }
        
        return dummy.next;
    }
    
}