package dev.shreyas.java.programs.geeksforgeeks.trees;

import java.util.*;

// refer https://www.geeksforgeeks.org/bottom-view-binary-tree/
/*
The following are steps to print Bottom View of Binary Tree.
1. We put tree nodes in a queue for the level order traversal.
2. Start with the horizontal distance(hd) 0 of the root node, keep on adding left
   child to queue along with the horizontal distance as hd-1 and right child as hd+1.
3. Also, use a TreeMap which stores key value pair sorted on key.
4. Every time, we encounter a new horizontal distance or an existing horizontal distance
   put the node data for the horizontal distance as key. For the first time it will add to
   the map, next time it will replace the value. This will make sure that the bottom most element
   for that horizontal distance is present in the map and if you see the tree from beneath that you will
   see that element.
 */
public class BottomViewOfATree {

    // Custom Solution
    private static void printBottomView(Node root){
        Map<Integer,Integer> nodeHDTracker = new HashMap<>();
        Map<Integer,Integer> hdMap = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        nodeHDTracker.put(root.data,0);
        queue.add(root);
        int hd;
        while (!queue.isEmpty()){
            Node currNode = queue.remove();
            hd = nodeHDTracker.get(currNode.data);
            hdMap.put(hd,currNode.data);
            if (currNode.left!=null){
                nodeHDTracker.put(currNode.left.data,hd-1);
                queue.add(currNode.left);
            }
            if (currNode.right!=null){
                nodeHDTracker.put(currNode.right.data,hd+1);
                queue.add(currNode.right);
            }
        }
        hdMap.forEach((key,value)->System.out.print(value+"\t"));
    }
    // Geeks For Geeks Solution
    public static void bottomView(Node root)
    {
        if (root == null)
            return;

        // Initialize a variable 'hd' with 0 for the root element.
        int hd = 0;

        // TreeMap which stores key value pair sorted on key value
        Map<Integer, Integer> map = new TreeMap<>();

        // Queue to store tree nodes in level order traversal
        Queue<Node> queue = new LinkedList<Node>();

        // Assign initialized horizontal distance value to root
        // node and add it to the queue.
        root.hd = hd;
        queue.add(root);

        // Loop until the queue is empty (standard level order loop)
        while (!queue.isEmpty())
        {
            Node temp = queue.remove();

            // Extract the horizontal distance value from the
            // dequeued tree node.
            hd = temp.hd;

            // Put the dequeued tree node to TreeMap having key
            // as horizontal distance. Every time we find a node
            // having same horizontal distance we need to replace
            // the data in the map.
            map.put(hd, temp.data);

            // If the dequeued node has a left child add it to the
            // queue with a horizontal distance hd-1.
            if (temp.left != null)
            {
                temp.left.hd = hd-1;
                queue.add(temp.left);
            }
            // If the dequeued node has a left child add it to the
            // queue with a horizontal distance hd+1.
            if (temp.right != null)
            {
                temp.right.hd = hd+1;
                queue.add(temp.right);
            }
        }

        // Extract the entries of map into a set to traverse
        // an iterator over that.
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        // Make an iterator
        Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();

        // Traverse the map elements using the iterator.
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Integer> me = iterator.next();
            System.out.print(me.getValue()+" ");
        }
    }

    public static void main(String[] args) {
        Node root = Node.getNonBST();
        printBottomView(root);
        System.out.println();
        bottomView(root);
    }
}
