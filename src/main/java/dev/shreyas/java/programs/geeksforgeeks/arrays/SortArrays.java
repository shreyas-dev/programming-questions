package dev.shreyas.java.programs.geeksforgeeks.arrays;

import java.util.Scanner;

// refer https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
public class SortArrays {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int arr[] =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            sortNPrint(arr);
        }
    }
    private static void sortNPrint(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<arr.length && mid>=low && mid<=high){
            while(low < arr.length && arr[low] == 0){
                low++;
            }
            while(high > -1 && arr[high]==2){
                high--;
            }
            if(low < arr.length && mid<low){
                mid=low;
            }
            if(arr[mid]==0){
                System.out.println(mid);
                System.out.println(low);
                arr[mid]=arr[low];
                arr[low]=0;
                low++;
            }else if(arr[mid] == 2){
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
            }else{
                mid++;
            }
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
