package dev.shreyas.java.programs.geeksforgeeks.trees;

public class SumOfAllGreaterNodes {
    static class Sum {
        int counter;
    }
    static void sumOfAllGreaterNodes(Node root,Sum sum){
        if (root == null){
            return ;
        }
        sumOfAllGreaterNodes(root.right,sum);
        root.data+=sum.counter;
        sumOfAllGreaterNodes(root.left,sum);
    }

    public static void main(String[] args) {
        Node root = Node.getDummyData();
        sumOfAllGreaterNodes(root, new Sum());
        DfsTraversals.printInOrder(root);
    }
}
