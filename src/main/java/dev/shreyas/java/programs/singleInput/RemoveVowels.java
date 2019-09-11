package dev.shreyas.java.programs.singleInput;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {
    public static String removeVowels(String str){
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: str.toCharArray()){
            if (!vowels.contains(c))
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("shreyas"));
    }
}
