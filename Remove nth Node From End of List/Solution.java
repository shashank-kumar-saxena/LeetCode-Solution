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
        if(head==null)
        {
            return head;
        }
        if(head.next==null)
        {
            return null;
        }
        ListNode fast=head,slow=head;
        while(n>0)
        {
            fast=fast.next;
            n--;
        }
        if(fast==null)
        {
            slow=slow.next;
            return slow;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;   
    }
}