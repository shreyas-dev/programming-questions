package dev.shreyas.java.programs.geeksforgeeks.dp;

// refer https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

// O(mn)
public class Part03LongestCommonSubsequence {
    private static int LCS(char[] s1,char[] s2){
        int n=s1.length;
        int m=s2.length;
        int[][] lcs = new int[n+1][m+1];

        // first row and column is used when none matches
        // that's why size is n+1,m+1
        for(int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                if (i==0||j==0){
                    lcs[i][j]=0;
                }
                else if (s1[i-1]==s2[j-1])
                  lcs[i][j]=lcs[i-1][j-1]+1;
                else
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                System.out.print(lcs[i][j]+"\t");
            }
            System.out.println();
        }

        // Create a character array to store the lcs string


        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = m, j = n;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (s1[i-1] == s2[j-1])
            {
                // Put current character in result
                System.out.println(s1[i-1]);

                // reduce values of i, j and index
                i--;
                j--;
            }

            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (lcs[i-1][j] > lcs[i][j-1])
                i--;
            else
                j--;
        }
        return lcs[n][m];
    }
    public static void main(String[] args)
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();

        System.out.println("Length of LCS is "+
                LCS( X, Y) );
    }
}
