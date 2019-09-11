package dev.shreyas.java.programs.geeksforgeeks.dp;

import java.util.Arrays;

public class Part09CountCoinChange {
    public static int coinChange(int[] coins,int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        for (int i=0;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if (coins[j]<=i){
                    dp[i]=Math.min(dp[i],1+ dp[i-coins[j]]);
                }
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println( coinChange(arr, 4));
    }
}
