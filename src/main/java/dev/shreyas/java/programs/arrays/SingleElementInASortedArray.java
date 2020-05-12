package dev.shreyas.java.programs.arrays;

/**
 * @author shreyas b
 * @created 12/05/2020 - 8:42 PM
 * @project programming-questions
 **/

/*
    You are given a sorted array consisting of only integers where every element appears exactly twice,
    except for one element which appears exactly once. Find this single element that appears only once.

    Example 1:
        Input: [1,1,2,3,3,4,4,8,8]
        Output: 2
    Example 2:
        Input: [3,3,7,7,10,11,11]
        Output: 10

    Note: Your solution should run in O(log n) time and O(1) space.
 */

public class SingleElementInASortedArray {
    // Using Binary search and xor operation

    /*
        Note: How can you implement the check operation?
        Remember the xor operation, and if you xor any number with 1, then it flips the LSB (Least significant bit).

        Ex.
            1) 100^1=101 [i.e 4^1=5, flips the first bit from right side]
            2) 101^1=100 [i.e 5^1=4, again flips the first bit from right side]
            So, if I is even, to find the next element we do I^1
            and if I is odd, to find the previous element we do I^1


            Basically even will be odd and odd will be even.
     */
    public int singleNonDuplicate(int[] a) {
        int l = 0;
        int h = a.length - 1;
        while (l < h) {
            int m = (l + h) / 2;
            if (a[m] == a[m ^ 1]) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return a[h];
    }
}
