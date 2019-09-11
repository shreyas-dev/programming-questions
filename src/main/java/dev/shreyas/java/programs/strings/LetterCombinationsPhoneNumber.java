package dev.shreyas.java.programs.strings;

import java.util.ArrayList;
import java.util.List;

/*
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
    A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:
    Input: "23"
    Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

Note:
    Although the above answer is in lexicographical order, your answer could be in any order you want.

    Time Complexity : O((letters in phone key)^n)
    where n is digits length
 */
public class LetterCombinationsPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        // base condition
        if(digits == null || digits.length()==0){
            return result;
        }
        // map phone keys to array
        String[] mappings = {
                "0",
                "1",
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };
        letterCombinations(digits,"",mappings,0,result);
        return result;
    }

    public void letterCombinations(String digits,String current,String[] mappings,int index,List<String> result){
        // if equal we have found one digit phase
        if(digits.length()==current.length()){
            result.add(current);
            return;
        }
        // if digit is "2" , mappings['2' - '0' ]  will give me mappings[2] .i.e abc
        String letters = mappings[digits.charAt(index)-'0'];

        //for all letters in mappings[i] call recursively
        // i.e. mappings[2] => "abc",call for a, then b and then c
        for (int i=0;i<letters.length();i++){
            // add to current character at index i
            // increment index to simulate selection condition
            letterCombinations(digits,current+letters.charAt(i),mappings,index+1,result);
        }
    }

    public static void main(String[] args) {
        LetterCombinationsPhoneNumber letterCombinationsPhoneNumber = new LetterCombinationsPhoneNumber();
        List<String> result =  letterCombinationsPhoneNumber.letterCombinations("34");
        for (String s : result) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
