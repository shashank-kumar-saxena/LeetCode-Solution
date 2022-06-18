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
var inorderTraversal = function(root) {
    var number=[];   
    if(root!=null)
        {inorder(root,number)}
        return(number);
    
}
function inorder(root,number)
{
    if(root!=null)
    {inorder(root.left,number);number.push(root.val);inorder(root.right,number);}}