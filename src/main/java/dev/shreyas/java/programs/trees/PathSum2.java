package dev.shreyas.java.programs.trees;

import java.util.ArrayList;
import java.util.List;

/*
    Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
    Note: A leaf is a node with no children.

    Example: Given the below binary tree and sum = 22,
          5
         / \
        4   8
       /   / \
      11  13  4
     /  \    / \
    7    2  5   1
    Return:

    [
       [5,4,11,2],
       [5,8,4,5]
    ]
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(PathSum.TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSum(root,sum,new ArrayList<>(),result);
        return result;
    }

    public void pathSum(PathSum.TreeNode node, int sum, List<Integer> current, List<List<Integer>> result){
        if(node == null) return;
        current.add(node.val);
        if(node.left == null && node.right == null && sum -node.val == 0)
            result.add(current);
        else {
            pathSum(node.left,sum-node.val,new ArrayList<>(current),result);
            pathSum(node.right,sum-node.val,new ArrayList<>(current),result);
        }
    }
}
