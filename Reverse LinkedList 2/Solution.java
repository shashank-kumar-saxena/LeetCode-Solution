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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null)
            return(head);
        ListNode temp=head;
        ListNode a[]=new ListNode[right];
        int i=0;
        while(temp!=null)
        {
            a[i]=temp;
                i++;
            temp=temp.next;
            if(i==right)
                break;
        }
        ListNode t;
        i=left-1;
        int j=a.length-1;
        while(i<=j)
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        head=null;
        ListNode temp2=null;
        for(i=0;i<a.length;i++)
        {
            if(head==null)
            {
                head=a[i];
                temp2=a[i];
            }
            else
            {
                temp2.next=a[i];
                temp2=temp2.next;
            }
        }
        temp2.next=temp;
        return(head);
    }
}