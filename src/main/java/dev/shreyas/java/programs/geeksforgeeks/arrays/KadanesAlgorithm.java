package dev.shreyas.java.programs.geeksforgeeks.arrays;

import java.util.Scanner;

// refer https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int[] arr =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            // kadane's algorithm
            int maxSoFar=0;
            int maxTillNow=Integer.MIN_VALUE;
            for (int i:arr){
                maxSoFar = Math.max(i,i+maxSoFar);
                if (maxSoFar>maxTillNow){
                    maxTillNow=maxSoFar;
                }
            }
            System.out.println(maxTillNow);
        }
    }
}
