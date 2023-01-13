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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList();
    if(root == null)
        return result;
    else
    {
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        while(q.size()>0)
        {
            Double d=0.0;
            int count=0;
            int size=q.size();
            while(size-->0)
            {
                TreeNode t=q.peek();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
               d=d+q.remove().val;
               count++;
            }
            result.add(d/count);
        }
    }    
        return result;
    }
}