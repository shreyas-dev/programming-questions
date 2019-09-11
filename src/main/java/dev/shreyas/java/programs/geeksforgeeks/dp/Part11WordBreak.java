package dev.shreyas.java.programs.geeksforgeeks.dp;

import java.util.Arrays;
import java.util.List;

public class Part11WordBreak {
    public static boolean wordBreak(List<String>  words,String str){
        int l = str.length();
        // if length is 0 then return true
        if (l == 0)
            return true;
        boolean[] dp = new boolean[l+1];
        for (int i=0;i<=l;i++){
            // dp array checks whether it already computed or not
            if ( !dp[i] && words.contains(str.substring(0,i)))
                dp[i]=true;

            if (dp[i]){
                // if i has reached end return true
                if (i == l)
                    return true;
                //
                for (int j=i+1;j<=l;j++){
                    if (!dp[j] && words.contains(str.substring(i,j)))
                        dp[j] = true;
                    if ( j==l && dp[j])
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String dictionary[] = { "mobile", "samsung", "sam",
                "sung", "man", "mango",
                "icecream", "and", "go",
                "i", "like", "ice", "cream" };
        List<String> dict = Arrays.asList(dictionary);
        System.out.println(wordBreak(dict,"ilikesamsung"));
        System.out.println(wordBreak(dict,"iiiiiiii"));
        System.out.println(wordBreak(dict,"") );
        System.out.println(wordBreak(dict,"samsungandmango"));
        System.out.println(wordBreak(dict,"samsungandmangok"));
    }
}
