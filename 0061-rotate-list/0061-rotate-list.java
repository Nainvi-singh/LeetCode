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
/*
1- build circular linked list
2-find the place that become tail
    length-k%length-1
3-make new head/ break the circular
*/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        //make circular
        temp.next=head;
        
        ListNode newTail=head;
        for(int i=0;i<len-(k%len)-1;i++){
            newTail=newTail.next;
            
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}