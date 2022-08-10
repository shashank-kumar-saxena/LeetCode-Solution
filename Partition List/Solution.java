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
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return(null);
        ListNode head1=null,tail1=null,head2=null,tail2=null;
        ListNode temp;
        while(head!=null)
        {
            temp=new ListNode();
            temp.val=head.val;
            if(head.val<x)
            {
                temp.next=null;
                if(head1==null)
                {
                    head1=temp;
                    tail1=temp;
                    head=head.next;
                    continue;
                }
                tail1.next=temp;
                tail1=temp;
            }
            else 
            {     
                temp.next=null;
                if(head2==null)
                {
                    head2=temp;
                    tail2=temp;
                    head=head.next;
                    continue;
                }
                tail2.next=temp;
                tail2=temp;
            }
            head=head.next;
        }
        if(tail1==null)
            return(head2);
        tail1.next=head2;
        return(head1);
    }
}