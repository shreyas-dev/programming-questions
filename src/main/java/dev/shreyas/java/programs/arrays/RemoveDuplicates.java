package dev.shreyas.java.programs.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * given an array return an array with duplicates removed
 */
public class RemoveDuplicates {
    public static Integer[] removeDuplicates(int[] arr){
        List<Integer> list = new ArrayList<Integer>();
        for(Integer i : arr){
            if (!list.contains(i)){
                list.add(i);
            }
        }
        Integer[] integers = new Integer[list.size()];
        return list.toArray(integers);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,3,100,100,1001};
        Integer[] integers = removeDuplicates(arr);
        for(int i:integers){
            System.out.print(i);
        }
    }
}
