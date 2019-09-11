package dev.shreyas.java.programs.geeksforgeeks.dp;

// refer https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/

// O(n^2)
public class Part02LongestIncreasingSubsequence {
    private static int lis(int[] arr){
        int n=arr.length;
        int[] lis = new int[n];
        for(int i=0;i<n;i++)
            lis[i]=1;
        for(int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if (arr[i]>arr[j] && lis[i]<lis[j]+1)
                    lis[i]=lis[j]+1;
            }
        }
        int max=0;
        int lisIndex=-1;
        for (int i=0;i<n;i++){
            if(max<lis[i]){
                max = lis[i];
                lisIndex=i;
            }
        }
        printLIS(lis,lisIndex,arr,max);
        return max;
    }

    public static void printLIS(int[] lis, int lisIndex, int[] arr, int max) {
        if(max == 0) {
            return;
        }
        if(lis[lisIndex] == max) {
            printLIS(lis,lisIndex-1, arr, max-1);
            System.out.print(arr[lisIndex] + " ");
        } else {
            printLIS(lis,lisIndex-1, arr, max);
        }

    }
    public static void main(String args[])
    {
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Length of lis is "
                + lis(arr) + "\n");
    }


}
