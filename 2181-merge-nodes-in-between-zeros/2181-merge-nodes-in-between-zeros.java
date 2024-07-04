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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode temp=head.next;
        ListNode temp2=temp;
        while(temp!=null){
            int sum=0;
            while(temp.val!=0){
                sum=sum+temp.val;
                temp=temp.next;
            }
            temp2.val=sum;
            temp = temp.next;
            temp2.next=temp;
            temp2=temp2.next;
        }
        return head.next;
    }
}