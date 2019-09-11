package dev.shreyas.java.programs.geeksforgeeks.arrays;

import java.util.Scanner;

// refer https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
public class MissingNumber {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int sumOfN=(n*(n+1))/2;
            for(int i=0;i<n-1;i++){
                sumOfN=sumOfN-scanner.nextInt();
            }
            System.out.println(sumOfN);
        }
    }
}
