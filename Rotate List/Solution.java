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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0)
            return(head);
        if(head==null)
            return(head);
        LinkedList<ListNode> list=new LinkedList();
        while(head!=null)
        {
            list.add(head);
            head=head.next;
        }
        ListNode temp=null;
            k=k%list.size();
        while(k>0)
        {
            temp=list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,temp);
            k--;
        }
        temp=null;
        for(ListNode l:list)
        {
            if(head==null)
            {
                head=l;
                temp=l;
            }
            else
            {
                temp.next=l;
                temp=temp.next;
            }
        }
        temp.next=null;
        return(head);
    }
}