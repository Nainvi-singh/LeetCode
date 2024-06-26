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
//         //two pass apporach-1
//         //length of LL
//         int count=0;
//         ListNode temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             count++;
//         }
//         int position=count-n;
//         temp=head;
//         int i=1;
//         while(i<=position){
//             temp=temp.next;
//             i++;
//         }
//         if(temp!=null && temp.next!=null)
//         temp.next=temp.next.next;
        
//         return next;
        
        //apporach 2
        ListNode p=head;
        ListNode q=head;
        for(int i=0;i<n;i++){
            p=p.next;
        }
        if(p==null){
            return head.next;
        }
        while(p.next!=null){
            p=p.next;
            q=q.next;
            
        }
        if(q!=null && q.next!=null ){
            q.next=q.next.next;
        
        }
        else{
            q.next=null;
        }
        return head;
    }
}