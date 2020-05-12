package dev.shreyas.java.programs.trees;

/**
 @author shreyas b
 @created 07/05/2020 - 9:42 PM
 @project programming-questions
 **/

/*
    In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

    Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

    We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

    Return true if and only if the nodes corresponding to the values x and y are cousins.
    
    Example 1:


    Input: root = [1,2,3,4], x = 4, y = 3
    Output: false
    Example 2:


    Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
    Output: true
    Example 3:



    Input: root = [1,2,3,null,4], x = 2, y = 3
    Output: false


    Note:

    The number of nodes in the tree will be between 2 and 100.
    Each node has a unique integer value from 1 to 100.
 */

public class CousinsBT {
    TreeNode xParent,yParent;
    int xDepth,yDepth;
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        depth(root,null,x,y,0);
        return (xDepth==yDepth)&&(xParent!=yParent);
    }

    // Using DFS
    public void depth(TreeNode node,TreeNode parent,int x,int y,int level){
        if(node == null) return;
        if(node.val==x){
            xDepth=level;
            xParent=parent;
        }else if(node.val==y){
            yDepth=level;
            yParent=parent;
        }
        // incrementing level
        depth(node.left,node,x,y,level+1);
        depth(node.right,node,x,y,level+1);
    }
    
}
