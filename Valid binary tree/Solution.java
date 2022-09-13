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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList();
        inorder(list,root);
        for(int i=1;i<list.size();i++)
        {
            if(!(list.get(i-1)<list.get(i)))
                return(false);
        }
        return(true);
    }
    void inorder(ArrayList<Integer> list,TreeNode root)
    {
        if(root!=null)
        {
            inorder(list,root.left);
            list.add(root.val);
            inorder(list,root.right);
        }
    }
}