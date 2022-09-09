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
    public void flatten(TreeNode root) {
        if(root==null)
            return ;
        ArrayList<TreeNode> list=new ArrayList();
        inorder(list,root);
        root=list.get(0);
        TreeNode t1,t2=root;
        root.left=null;
        for(int i=1;i<list.size();i++)
        {
            t1=list.get(i);
            t2.left=null;
            t2.right=t1;
            t2=t1;
        }
    }
    static void inorder(ArrayList<TreeNode> list,TreeNode root)
    {
        if(root!=null)
        {list.add(root);
        inorder(list,root.left);
        inorder(list,root.right);}
    }
}