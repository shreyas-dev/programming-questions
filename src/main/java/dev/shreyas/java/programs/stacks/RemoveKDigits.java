package dev.shreyas.java.programs.stacks;

import java.util.Stack;

/**
 * @author shreyas b
 * @created 13/05/2020 - 9:35 PM
 * @project programming-questions
 **/

/*
   Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

    Note:
    The length of num is less than 10002 and will be ≥ k.
    The given num does not contain any leading zero.
    Example 1:
        Input: num = "1432219", k = 3
        Output: "1219"
        Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
    Example 2:
        Input: num = "10200", k = 1
        Output: "200"
        Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
    Example 3:
        Input: num = "10", k = 2
        Output: "0"
        Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        // In case k is 0 return the original string
        if(k == 0) return num;

        // In case k == num.length() we will return 0 as we will remove every digit
        if(k == num.length()) return "0";

        Stack<Character> stk = new Stack<>();
        for(char c : num.toCharArray()){
            // In case the current digit is less than the previous digit, remove the previous digit
            while(!stk.isEmpty() && k > 0 && stk.peek() > c){
                stk.pop();
                k--;
            }
            stk.push(c);
        }

        // Remove the remaining digits from the tail.
        for(int i = 0; i < k; i++){
            stk.pop();
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        // Reversing the StringBuilder
        sb.reverse();

        // Removing the leading zeroes if any
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
