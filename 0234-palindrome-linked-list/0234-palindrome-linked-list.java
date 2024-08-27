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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode second=newHead;
        ListNode first =head;
        while(newHead!=null){
            if(head.val!=newHead.val){
                return false;
            }
            head=head.next;
            newHead=newHead.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        //maintain 3 pointer
        ListNode previous=null;
        ListNode current=head;

        while(current!=null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}