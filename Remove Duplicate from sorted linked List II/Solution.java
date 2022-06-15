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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr=head,proot=null;
        int val;
        if(head==null||head.next==null)
            return head;
        while(ptr.next!=null)
        {
            if(ptr.val==ptr.next.val)
            {
                if(ptr==head)
                {
                    val=head.val;
                    while(head.val==val)
                    {
                        head=head.next;
                        if(head==null)
                            return head;
                    }
                    ptr=head;
                }
                else
                {
                    val=ptr.val;
                    while(ptr.val==val)
                    {
                        ptr=ptr.next;
                        if(ptr==null)
                        {
                            proot.next=null;
                            return(head);
                        }
                    }
                    proot.next=ptr;
                    ptr=proot;
                }
             }
            else
            {
                proot=ptr;
                ptr=ptr.next;
            }
         }
        return(head);
    }
}