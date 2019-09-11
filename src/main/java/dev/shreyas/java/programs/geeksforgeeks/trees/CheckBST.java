package dev.shreyas.java.programs.geeksforgeeks.trees;

public class CheckBST {
    static boolean isBST(Node node){
        if (node == null)
            return true;
        if(node.left != null && node.left.data > node.data)
            return false;
        if(node.right!= null && node.right.data < node.data)
            return false;
        return isBST(node.left) && isBST(node.right);
    }

    public static void main(String[] args) {
        Node root= Node.getNonBST();
        if(isBST(root)){
            System.out.println("BST");
        }else{
            System.out.println("Not a BST");
        }
    }
}
