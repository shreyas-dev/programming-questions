package dev.shreyas.java.programs.geeksforgeeks.arrays;

import java.util.Stack;

// refer https://www.geeksforgeeks.org/next-greater-element/
public class FindNextGreaterElement {
    static void printNGE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i=1;i<arr.length;i++){
            if (!stack.isEmpty()){
                int element = stack.pop();
                while (element < arr[i]){
                    System.out.print(arr[i] + "\t");
                    if (stack.isEmpty())
                        break;
                    element = stack.pop();
                }
                if (element > arr[i]){
                    stack.push(element);
                }
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            stack.pop();
            System.out.print("-1\t");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 11, 13, 21, 3 ,5 };
        printNGE(arr);
    }
}
