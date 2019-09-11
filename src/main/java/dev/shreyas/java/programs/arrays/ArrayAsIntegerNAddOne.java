package dev.shreyas.java.programs.arrays;

public class ArrayAsIntegerNAddOne {
    private static int[] addOneToArrayInteger(int[] arr){
        boolean carryOver=true;
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]==9){
                arr[i]=0;
            }else{
                arr[i]=arr[i]+1;
                carryOver=false;
                break;
            }
        }
        if (carryOver){
            System.out.println("Initializing new array");
            int[] temp = new int[arr.length+1];
            temp[0]=1;
            return temp;
        }
        else return arr;
    }

    public static void main(String[] args) {
        int[] arr={9,8,9};
        arr = addOneToArrayInteger(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
}
