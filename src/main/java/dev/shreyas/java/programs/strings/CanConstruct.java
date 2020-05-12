package dev.shreyas.java.programs.strings;

/**
 * @author shreyas b
 * @created 05/05/2020 - 9:20 PM
 * @project programming-questions
 **/

/*
    Given an arbitrary ransom note string and another string containing letters from all the magazines,
    write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
    Each letter in the magazine string can only be used once in your ransom note.

    Note: You may assume that both strings contain only lowercase letters.

    canConstruct("a", "b") -> false
    canConstruct("aa", "ab") -> false
    canConstruct("aa", "aab") -> true

 */


public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        // contains only lowercase,so make int array of only 26 character
        int[] charArray = new int[26];

        // For each char in magazine array m increment it's value
        for(char c:magazine.toCharArray()){
            charArray[c-'a']++;
        }
        // For each char in character array decrement it's value
        for(char c:ransomNote.toCharArray()){
            // if char is not present in magazine
            if(charArray[c-'a']==0)
                return false;
            charArray[c-'a']--;
        }
        return true;
    }
}
