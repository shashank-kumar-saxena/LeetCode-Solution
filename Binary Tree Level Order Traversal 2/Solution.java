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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new LinkedList();
    if(root == null)
        return result;
    else
    {
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        while(q.size()>0)
        {
            List<Integer> list=new LinkedList();
            int size=q.size();
            while(size-->0)
            {
                TreeNode t=q.peek();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                list.add(q.remove().val);
            }
            result.add(0,list);
        }
    }    
        return result;