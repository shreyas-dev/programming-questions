package dev.shreyas.java.programs.geeksforgeeks.trees;


import java.util.Stack;

// refer https://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
public class SpiralForm {

    public static void printZigZag(Node root){
        Stack<Node> zig = new Stack<>();
        Stack<Node> zag = new Stack<>();
        zig.push(root);
        while (!zig.isEmpty() || !zag.isEmpty()){
            while (!zig.isEmpty()){
                Node temp = zig.pop();
                if(temp.right !=null)
                    zag.push(temp.right);
                if (temp.left != null)
                    zag.push(temp.left);
                System.out.print(temp.data+"\t");
            }
            while (!zag.isEmpty()){
                Node temp = zag.pop();
                if (temp.left != null)
                    zig.push(temp.left);
                if(temp.right !=null)
                    zig.push(temp.right);
                System.out.print(temp.data+"\t");
            }
        }
    }

    public static void main(String[] args) {
        Node node = Node.getDummyData();
        printZigZag(node);
    }

}
