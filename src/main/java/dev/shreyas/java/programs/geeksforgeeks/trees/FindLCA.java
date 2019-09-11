package dev.shreyas.java.programs.geeksforgeeks.trees;


// refer https://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/
public class FindLCA {

    public static Node findLCA(Node node, int n1,int n2){
        if (node == null)
            return null;
        if(node.data < n1 && node.data < n2)
            return findLCA(node.right,n1,n2);
        if (node.data > n1 && node.data > n2)
            return findLCA(node.left,n1,n2);
        return node;
    }

    public static void main(String[] args) {
        Node root = Node.getDummyData();
        System.out.println(findLCA(root,8,8).data);

    }
}
