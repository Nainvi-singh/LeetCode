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
    public int getDecimalValue(ListNode head) {
    
        // ListNode pointer = head;
        // int length = 1;
        // int number = 0;
        // while(pointer.next!=null){
        //     length ++;
        //     pointer = pointer.next;
        // }
        // pointer = head;
        // while(length > 0){
        //     int value = pointer.val;
        //     if(value == 1){
        //         number+=Math.pow(2,length-1);
        //     }
        //     pointer = pointer.next;
        //     length--;
        // }
        // return number;
        
        //apporach 2
        int val=head.val;
        while(head.next!=null){
            val=val*2 +head.next.val;
            head =head.next;
            
        }
        return val;
    }
}