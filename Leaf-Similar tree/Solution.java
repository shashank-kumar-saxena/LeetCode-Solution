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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list =new ArrayList();
        ArrayList<Integer> list2=new ArrayList();
        check(root1,list);
        check(root2,list2);
        return list.equals(list2)==true;
    }
    static void check(TreeNode root,List<Integer> l)
    {
        if(root!=null)
        {
            check(root.left,l);
            if(root.left==null&&root.right==null)
                l.add(root.val);
            check(root.right,l);
        }
    }
}