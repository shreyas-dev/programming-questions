package dev.shreyas.java.programs.geeksforgeeks.trees;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public int hd;


    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    /*
                      10
                    /   \
                  5      14
                /  \     / \
               3    8   11  18
     */


    public static Node getDummyData(){
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.right= new Node(8);
        root.right = new Node(14);
        root.right.left = new Node(11);
        root.right.right = new Node(18);
        root.left.left = new Node(3);
        return root;
    }

    public static Node getNonBST(){
        Node root = new Node(5);
        root.left = new Node(11);
        root.left.right= new Node(1);
        root.right = new Node(31);
        root.right.left = new Node(12);
        root.right.right = new Node(128);
        root.left.left = new Node(33);
        return root;
    }

    public static Node getBT(){
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        return root;
    }
}
