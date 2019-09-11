package dev.shreyas.java.programs.linkedlist;

public class AddOneToLinkedList {
    private static boolean carryOver=false;
    private static Node addOne(Node head){
        add(head);
        if (carryOver){
            return new Node(1,head);
        }
        return head;
    }

    private static void add(Node node){
        if (node==null) {
            carryOver = true;
            return;
        }
        add(node.next);
        if (carryOver){
            if(node.getData()+1>9){
                node.setData(0);
                carryOver=true;
            }else{
                node.setData(node.getData()+1);
                carryOver = false;
            }
        }
    }
    public static void main(String[] args) {
        Node head = new Node(9,new Node(9,new Node(9,null)));
        Node sum=addOne(head);
        while (sum!=null){
            System.out.print(sum.getData());
            sum=sum.next;
        }
    }
}
class Node {
    private int data;
    Node next;
    int getData(){
        return data;
    }
    void setData(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

}
