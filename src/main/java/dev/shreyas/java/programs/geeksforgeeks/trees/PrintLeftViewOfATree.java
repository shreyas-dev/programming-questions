package dev.shreyas.java.programs.geeksforgeeks.trees;


// refer https://www.geeksforgeeks.org/print-left-view-binary-tree/
public class PrintLeftViewOfATree {
    private static int maxLevel = -1;
    private static void printLeft(Node node,int currLevel){
        if (node == null){
            return;
        }
        if (currLevel > maxLevel){
            System.out.print(node.data+"\t");
            maxLevel=currLevel;
        }
        printLeft(node.left,currLevel+1);
        printLeft(node.right,currLevel+1);
    }

    public static void main(String[] args) {
        Node tree = Node.getDummyData();
        printLeft(tree,0);
    }
}
