package dev.shreyas.java.programs.numberSystems;

/**
 * @author shreyas b
 * @created 05/05/2020 - 10:21 PM
 * @project programming-questions
 **/


/*
    Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

    Example 1:

        Input: 5
        Output: 2
        Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.


   Example 2:

        Input: 1
        Output: 0
        Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

 */

public class NumberCompliment {


    public int findComplement(int n) {

        int sum=1;
        // Trick is rotate 1 to the max bit of n
        // that is if n is 5 -> binary -> 101 , max bit -> 111 (7)
        // n is 12 -> 1100 , max bit 1111 (15)
        while(sum < n){
            sum = (sum << 1) +1;
        }

        // let's say n is 12(1100) then sum will be 15 (1111)
        // 1111 - 1100 will give you 12's compliment
        return sum-n;
    }
}
