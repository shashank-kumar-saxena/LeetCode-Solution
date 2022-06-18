/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var postorderTraversal = function(root) {
    var number=[];   
    if(root!=null)
        {post(root,number)}
        return(number);
    
}
function post(root,number)
{
    if(root!=null)
    {post(root.left,number);post(root.right,number);number.push(root.val);}}