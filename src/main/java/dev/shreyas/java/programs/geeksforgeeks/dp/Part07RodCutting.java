package dev.shreyas.java.programs.geeksforgeeks.dp;

// refer https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
public class Part07RodCutting {
    /* Returns the best obtainable price for a rod of
       length n and price[] as prices of different pieces */
    static int cutRod(int[] price , int n){
        int[] val = new int[n+1];
        val[0]=0;
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i=1;i<=n;i++){
            int maxVal = Integer.MIN_VALUE;
            for (int j=0;j<i;j++)
                maxVal = Math.max(maxVal,price[j]+val[i-j-1]);
            val[i]=maxVal;
        }
        return val[n];
    }
    public static void main(String args[]) {
        int[] arr = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                cutRod(arr, size));
    }
    }
