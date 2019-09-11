package dev.shreyas.java.programs.geeksforgeeks.arrays;


import java.util.Scanner;

/*
    refer https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 */
public class SubarraySum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        // no. of test cases
        while(t-->0){
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int[] arr =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            boolean flag=false;
            // used to calculate the sum of the sliding window
            int windowSum=0;
            // holds the index of first element in the sliding window
            int windowHeader=0;
            for(int i=0;i<n;i++){
                // add the sum
                windowSum+=arr[i];
                // if windowSum is greater than the given sum ,
                // remove elements from the left using header index
                while (windowSum>sum){
                    // subtract elements which are removed
                    windowSum-=arr[windowHeader++];
                }
                if(windowSum==sum){
                    flag=true;
                    System.out.println((windowHeader+1)+" "+(i+1));
                    break;
                }
            }
            if(!flag){
                System.out.println("-1");
            }

        }
    }
}
