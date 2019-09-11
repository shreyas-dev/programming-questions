package dev.shreyas.java.programs.geeksforgeeks.dp;

// refer https://www.geeksforgeeks.org/edit-distance-dp-5/
/*
    Time Complexity: O(mn)
    Auxiliary Space: O(m x n)

 */
public class Part04EditDistance {

    public static int editDistance(String s1,String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i=0;i<=s1.length();i++){
            for (int j=0;j<=s2.length();j++){
                // If first string is empty, only option is to
                // insert all characters of second string
                if (i == 0)
                    dp[i][j]=j;
                // If second string is empty, only option is to
                // remove all characters of second string
                else if(j == 0)
                    dp[i][j] = i;
                // If last characters are same, ignore last char
                // and recur for remaining string
                else if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                // If the last character is different, consider all
                // possibilities and find the minimum
                else
                    // insert,remove,replace
                    dp[i][j]=1+min(dp[i][j-1],dp[i][j-1],dp[i-1][j-1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static int min (int a ,int b,int c){
        if (a <=b && a <=c)
            return a;
        else if (b<=a && b<=c)
            return b;
        return c;
    }

    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";
        System.out.println( editDistance( str1 , str2) );
    }
}
