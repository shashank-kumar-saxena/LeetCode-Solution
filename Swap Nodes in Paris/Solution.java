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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return(head);
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        ListNode list[]=new ListNode[count];
        temp=head;
        int i=0;
        for(temp=head;temp!=null;temp=temp.next)
        {
            list[i++]=temp;
        }
        head=null;
        temp=null;
        for(i=1;i<list.length;i+=2)
        {
            temp=list[i];
            list[i]=list[i-1];
            list[i-1]=temp;
            
        }
        for(i=0;i<list.length;i++)
        {
            if(head==null)
            {
                head=list[0];
                temp=list[0];
            }
            else
            {
                temp.next=list[i];
                temp=temp.next;
            }
        }
        temp.next=null;
        return(head);
    }
}