/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> list=new HashSet();
        boolean a[]={false};
        fun(root,k,list,a);
        return a[0];
    }
    static void fun(TreeNode root,int k,HashSet<Integer> list,boolean a[])
    {
        if(root!=null)
        {
            if(list.contains(k-root.val))
            {
                a[0]=true;
                return ;
            }
            list.add(root.val);
             fun(root.left,k,list,a);
             fun(root.right,k,list,a);
        }
    }
}