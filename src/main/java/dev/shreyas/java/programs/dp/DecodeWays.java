package dev.shreyas.java.programs.dp;

/*
    A message containing letters from A-Z is being encoded to numbers using the following mapping:
    'A' -> 1
    'B' -> 2
    ...
    'Z' -> 26

Given a non-empty string containing only digits, determine the total number of ways to decode it.

Example 1:

    Input: "12"
    Output: 2
    Explanation: It could be decoded as "AB" (1 2) or "L" (12).

Example 2:
    Input: "226"
    Output: 3
    Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */
public class DecodeWays {

    public int numDecodings(String s) {
        // button up approach
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        // if s has 0 at first index then u can decode it in 0 ways
        // else u can decode it in 1 way
        dp[1] = s.charAt(0) == '0'? 0 : 1;
        for (int i=2;i<=s.length();i++){
            // Get 1 digit from current i
            int oneDigit = Integer.valueOf(s.substring(i-1,i));
            // Get 2 digit from current i
            int twoDigit = Integer.valueOf(s.substring(i-2,i));
            // if oneDigit is 0 then we can't decode.
            // hence check >= 1
            if (oneDigit >= 1 )
                dp[i] += dp[i-1];
            // check if the two digit is in the 10 to 26 range
            if (twoDigit >= 10 && twoDigit < 27)
                dp[i] += dp[i-2];
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
        System.out.println(decodeWays.numDecodings("12")); // Explanation: It could be decoded as "AB" (1 2) or "L" (12).
        System.out.println(decodeWays.numDecodings("226")); // It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
    }
}
