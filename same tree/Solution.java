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
    ArrayList<Integer> list1=new ArrayList();
    ArrayList<Integer> list2=new ArrayList();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        list1.clear();
        list2.clear();
        if(p==null&&q==null)
            return(true);
        if(p==null)
            return(false);
        if(q==null)
            return(false);
        return(check(p,q));
    }
    static boolean check(TreeNode p,TreeNode q)
    {
        if(p==null&&q==null)
          return true;
        if(p==null||q==null||p.val!=q.val)
          return false;
       return check(p.left,q.left) && check(p.right,q.right);
    }
}