package dev.shreyas.java.programs.arrays;

/**
 * @author shreyas b
 * @created 06/05/2020 - 10:26 PM
 * @project programming-questions
 **/

/*
    Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3
    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2

    Refer Boyer Moore Voting Algorithm

    @link https://www.youtube.com/watch?v=Sq3HfW5HqoM&feature=youtu.be

    @Also see https://www.geeksforgeeks.org/n3-repeated-number-array-o1-space/
 */

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=-1;
        for(int i:nums){
            if(count==0){
                candidate=i;
            }
            count+=(candidate==i) ? 1 : -1;
        }
        return candidate;
    }
}
