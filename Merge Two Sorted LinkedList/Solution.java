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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null)
        {
            return(list1);
        }
        ListNode list3=null;
        ListNode temp=null;
        while(true)
        {
            temp=new ListNode();
            if(list1==null&&list2==null)
            {
               break;
            }
            if(list1==null)
            {
                temp.val=list2.val;
                temp.next=list3;
                list3=temp;
                list2=list2.next;
                continue;
            }
            if(list2==null)
            {
                temp.val=list1.val;
                temp.next=list3;
                list3=temp;
                list1=list1.next;
                continue;
            }
            if(list1.val>=list2.val)
            {
                temp.val=list2.val;
                temp.next=list3;
                list3=temp;
                list2=list2.next;
                continue;
            }
            if(list1.val<list2.val)
            {
                temp.val=list1.val;
                temp.next=list3;
                list3=temp;
                list1=list1.next;
                continue;
            }
        }
        ListNode current=list3,next,prev=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return(prev);
    }
}