package dev.shreyas.java.programs.arrays;

/**
 * Given an array, skip 1st element , then print next 2 elements,
 * skip next 3 elements , then print next 4 elements and so on.
 */
public class PrintAlternateElements {

    private static void printAlternateElements(int[] arr){
        // using j to increment and pseudo-flag
        int j=1;
        for (int i=0;i<arr.length&&j<arr.length;){
            // only print when j is even.
            if (j%2==0){
                int k=i;
                while (k<i+j&&k<arr.length){
                    System.out.print(arr[k]+"\t");
                    k++;
                }
            }

            i=i+j;
            j++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        printAlternateElements(arr);
        int[] arr1=new int[100];
        for (int i=0;i<100;i++){
            arr1[i] = i;
        }
        printAlternateElements(arr1);
    }

}
