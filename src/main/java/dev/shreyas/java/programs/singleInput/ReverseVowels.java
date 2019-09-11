package dev.shreyas.java.programs.singleInput;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int firstPointer =0;
        int lastPointer = c.length-1;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while(lastPointer > firstPointer){
            while (firstPointer < c.length && firstPointer < lastPointer && !vowels.contains(c[firstPointer])) firstPointer ++;
            while (lastPointer >= 0 && lastPointer > firstPointer && !vowels.contains(c[lastPointer])) lastPointer --;
            char temp = c[firstPointer];
            c[firstPointer] = c[lastPointer];
            c[lastPointer] = temp;
            firstPointer ++;
            lastPointer --;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
