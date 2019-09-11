package dev.shreyas.java.programs.geeksforgeeks.trees;

public class PrintRightViewOfTree {
    private static int maxLevel = -1;
    public static void printRight(Node root){
        printRight(root,1);
    }

    public static void printRight(Node root,int level){
        if (root == null) return;
        if (level > maxLevel){
            System.out.print(root.data+" ");
            maxLevel = level;
        }
        printRight(root.right,level+1);
        printRight(root.left,level+1);
    }


    public static void main(String[] args) {
        Node root = Node.getDummyData();
        printRight(root);
    }

}
