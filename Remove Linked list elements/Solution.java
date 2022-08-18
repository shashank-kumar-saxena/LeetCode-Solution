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
    public ListNode removeElements(ListNode head, int val) {
        ListNode headc=head;
        if(head==null)
            return(head);
        if(head.val==val)
        {
            head=head.next;
            headc=head;
        }
        while(head!=null)
        {
            while(head.next!=null)
        {
            if(head.next.val==val)
                break;
            head=head.next;
        }
            if(head.next!=null)
                head.next=head.next.next;
            else
                break;
        }
        if(headc!=null&&headc.val==val)
            headc=headc.next;
        return(headc);
    }
}