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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null)
            return head;
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        ListNode list[]=new ListNode [count];
        temp=head;
        count=0;
        while(temp!=null)
        {
            list[count++]=temp;
            temp=temp.next;
        }
        int len=list.length-(list.length%k);
        for(int i=0;i<len;i+=k)
        {
            int l=i,u=i+k-1;
            while(l<=u)
            {
                temp=list[l];
                list[l]=list[u];
                list[u]=temp;
                l++;
                u--;
            }
        }
        head=null;
        for(int i=0;i<list.length;i++)
        {
            if(head==null)
            {
                head=list[i];
                temp=list[i];
            }else
            {
                temp.next=list[i];
                temp=temp.next;
            }
        }
        temp.next=null;
        return(head);
    }
}