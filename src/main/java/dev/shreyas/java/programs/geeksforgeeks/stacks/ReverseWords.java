package dev.shreyas.java.programs.geeksforgeeks.stacks;


import java.util.Scanner;
import java.util.Stack;

// refer https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
public class ReverseWords {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- > 0){
            Stack<String> stack=new Stack<String>();
            String string = scan.next();
            char[] arr = string.toCharArray();
            int lastDot=-1,i;
            for (i=0;i<arr.length;i++){
                if (arr[i]=='.'){
                    String word =string.substring(lastDot+1,i);
                    stack.push(word);
                    lastDot = i;
                }
            }
            stack.push(string.substring(lastDot+1,i));
            while ( !stack.isEmpty()){
                String s =stack.pop();
                System.out.print(stack.isEmpty()?s+"\n":s+".");
            }
        }
    }
}
