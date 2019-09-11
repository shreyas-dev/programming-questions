package dev.shreyas.java.programs.geeksforgeeks.arrays;

public class FindClosestPair {
    public static void findClosestPair(int arr[],int sum){
        // keep two pointer
        int l=0,r=arr.length-1;
        int diff = Integer.MAX_VALUE;
        int resL=-1,resR=-1;
        while(r>l){
            // if diff is smaller
            if (Math.abs(arr[l]+arr[r]-sum) < diff){
                resL=l;
                resR=r;
                diff=Math.abs(arr[l]+arr[r]-sum);
            }
            if (arr[l]+arr[r]   >   sum)
                r--;
            else
                l++;
        }
        System.out.println(" The closest pair is "+arr[resL]+" and "+ arr[resR]);
    }

    public static void main(String[] args) {
        int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54;
        findClosestPair(arr, x);
    }
}
