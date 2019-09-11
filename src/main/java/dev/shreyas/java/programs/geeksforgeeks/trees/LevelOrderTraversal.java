package dev.shreyas.java.programs.geeksforgeeks.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static Queue<Node> nodeQueue= new LinkedList<>();
    public static void printLevelOrderTranserving(Node root){
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            Node current = nodeQueue.remove();
            if (current.left != null)
                nodeQueue.add(current.left);
            if (current.right !=null)
                nodeQueue.add(current.right);
            System.out.print(current.data+"\t");
        }
    }

    public static void main(String[] args) {
        Node root=Node.getDummyData();
        printLevelOrderTranserving(root);
    }
}
