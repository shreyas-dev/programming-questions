package dev.shreyas.java.programs.trees;

/*
    Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
    Note: A leaf is a node with no children.

Example:
    Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
       return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        // check for leaf node and sum condition
        else if(root.right == null && root.left == null && sum-root.val == 0)
            return true;
        else
            // check for left and right child
            return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
