package dev.shreyas.java.programs.geeksforgeeks.trees;

// refer https://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
public class SizeOfATree {
    static int size(Node root){
        if (root == null)
            return 1;
        return (size(root.left)+size(root.right));
    }

    public static void main(String[] args) {
        Node root = Node.getDummyData();
        System.out.println(size(root));
    }
}
