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
var preorderTraversal = function(root) {
  var number=[];   
    if(root!=null)
        {pre(root,number)}
        return(number);
    
}
function pre(root,number)
{
    if(root!=null)
    {number.push(root.val);pre(root.left,number);pre(root.right,number);}}