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
        if(head==null||head.next==null)
        {
            return(head);
        }
        ListNode temp=head,store=null;
        while(temp.next!=null)
        {
            if(temp.val==(temp.next).val)
            {
                store=temp;
                while(store.val==temp.val)
                {
                    temp=temp.next;
                    if(temp==null)
                    {
                        store.next=null;
                        return head;
                    }
                    if(store.val!=temp.val)
                    {
                        store.next=temp;
                        break;
                    }
                }
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }
}