package dev.shreyas.java.programs.geeksforgeeks.trees;

public class KthLargestElement {
    static class Counter {
        int count;
    }
    public static void kthLargestElement(Node root, int k, Counter counter){
        if (root == null)
            return;
        kthLargestElement(root.right,k,counter);
        counter.count+=1;
        if (k==counter.count){
            System.out.println(k+"th largest Element is "+root.data);
        }
        kthLargestElement(root.left,k,counter);
    }

    public static void main(String[] args) {
        Node node   =   Node.getDummyData();
        kthLargestElement(node,3,new Counter());
    }
}
