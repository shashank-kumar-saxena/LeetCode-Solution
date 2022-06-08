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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String Snum1="",Snum2="";
        while(true)
        {
            if(l1!=null)
            {
                Snum1=Integer.toString(l1.val)+Snum1;
                l1=l1.next;
            }
            if(l2!=null)
            {
                Snum2=Integer.toString(l2.val)+Snum2;
                l2=l2.next;
            }
            if(l1==null&l2==null)
            {break;}
        }
        java.math.BigInteger num1=new java.math.BigInteger(Snum1);
        java.math.BigInteger num2=new java.math.BigInteger(Snum2);
        
            Snum1=(num1.add(num2)).toString();
                
        l1=null;
        l2=null;
        for(int i=0;i<Snum1.length();i++)
        {
            l1=new ListNode();
            l1.val=Integer.parseInt(String.valueOf(Snum1.charAt(i)));
            l1.next=l2;
            l2=l1;
        }
        return(l2);
    }
}