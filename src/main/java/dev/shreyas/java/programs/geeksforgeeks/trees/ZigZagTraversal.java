package dev.shreyas.java.programs.geeksforgeeks.trees;

import java.util.Stack;

public class ZigZagTraversal {
    public static void printZigZag(Node root){
        Stack<Node> zig = new Stack<>();
        Stack<Node> zag = new Stack<>();
        boolean leftToRight = true;
        zig.push(root);
        while (!zig.isEmpty()){
            Node temp = zig.pop();
            if (leftToRight){
                if (temp.left != null)
                    zag.push(temp.left);
                if (temp.right != null)
                    zag.push(temp.right);
            }else{
                if (temp.right != null)
                    zag.push(temp.right);
                if (temp.left != null)
                    zag.push(temp.left);
            }
            if (zig.isEmpty()){
                leftToRight=!leftToRight;
                Stack<Node> tempStack = zig;
                zig = zag;
                zag = tempStack;
            }
            System.out.print(temp.data+"\t");
        }
    }

}
