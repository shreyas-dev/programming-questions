package dev.shreyas.java.programs.geeksforgeeks.arrays;

import java.util.HashSet;
import java.util.Scanner;

// refer https://practice.geeksforgeeks.org/problems/count-the-triplets/0
public class FindTriplets {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int[] arr =new int[n];
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                set.add(arr[i]);
            }
            int count=0;
            // O(n^2)
            for(int i=0;i<n;i++){
                for(int j=0;i!=j&&j<n;j++){
                    if(set.contains(arr[i]+arr[j])){
                        count++;
                    }
                }
            }
            System.out.println(count==0?-1:count);
        }
    }
}
