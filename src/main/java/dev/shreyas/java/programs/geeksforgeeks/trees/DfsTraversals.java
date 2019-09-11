package dev.shreyas.java.programs.geeksforgeeks.trees;

public class DfsTraversals {
    public static void printInOrder(Node node){
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.data +"\t");
        printInOrder(node.right);
    }
    public static void printPreOrder(Node node){
        if (node == null)
            return;
        System.out.print(node.data +"\t");
        printInOrder(node.left);
        printInOrder(node.right);
    }

    public static void printPostOrder(Node node){
        if (node == null)
            return;
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(node.data +"\t");
    }

    public static void main(String[] args) {
        Node root =Node.getDummyData();
        printInOrder(root);
        System.out.println();
        printPostOrder(root);
        System.out.println();
        printPreOrder(root);
    }

}
