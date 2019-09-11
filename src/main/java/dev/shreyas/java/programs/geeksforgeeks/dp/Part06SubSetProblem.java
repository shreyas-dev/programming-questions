package dev.shreyas.java.programs.geeksforgeeks.dp;

// refer https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

//  O(sum*n)
public class Part06SubSetProblem {
    static boolean isSubsetSum(int[] set,int n,int sum){
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        boolean subset[][] = new boolean[n+1][sum+1];
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[i][0] = true;
        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[0][i] = false;
        // Fill the subset table in botton
        // up manner
        for (int i =1; i<=n;i++){
            for (int j=1;j<=sum;j++){
                subset[i][j] = subset[i-1][j];
                if (j >= set[i-1]){
                    subset[i][j] = subset[i][j] || subset[i-1][j-set[i-1]];
                }
            }
        }
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= sum; j++)
                System.out.print(subset[i][j]+"\t");
            System.out.println();
        }
        return subset[n][sum];
    }
    public static void main (String args[])
    {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum))
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}
