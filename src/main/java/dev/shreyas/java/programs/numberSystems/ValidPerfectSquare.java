package dev.shreyas.java.programs.numberSystems;

/**
 * @author shreyas b
 * @created 10/05/2020 - 2:57 PM
 * @project programming-questions
 **/


/*
    Given a positive integer num, write a function which returns True if num is a perfect square else False.

    Note: Do not use any built-in library function such as sqrt.

    Example 1:
        Input: 16
        Output: true

    Example 2:
        Input: 14
        Output: false
 */

public class ValidPerfectSquare {

    // Using Bearch Search Algo
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2; // to avoid overflow incase (left+right)>2147483647
            int res = num / mid, remain = num % mid;
            if (res == mid && remain == 0) return true; // check if mid * mid == num
            if (res > mid) { // mid is small -> go right to increase mid
                left = mid + 1;
            } else {
                right = mid - 1; // mid is large -> to left to decrease mid
            }
        }
        return false;
    }
}
