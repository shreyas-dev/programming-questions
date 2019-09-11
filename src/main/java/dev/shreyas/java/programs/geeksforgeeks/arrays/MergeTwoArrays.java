package dev.shreyas.java.programs.geeksforgeeks.arrays;

// refer https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/

import java.util.Scanner;

class MergeTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();
            int[] a1 = new int[l1];
            int[] a2 = new int[l2];
            int i = 0;
            while (i < l1) {
                a1[i] = sc.nextInt();
                i++;
            }
            i = 0;
            while (i < l2) {
                a2[i] = sc.nextInt();
                i++;
            }
            int l = l1 + l2;
            i = 0;
            int j = 0, k = 0;
            int[] a = new int[l];
            while (i < l) {
                if (j == l1) {
                    a[i] = a2[k];
                    k++;
                } else if (k == l2) {
                    a[i] = a1[j];
                    j++;
                } else if (a1[j] > a2[l2 - 1]) {
                    while (k < l2) {
                        a[i] = a2[k];
                        k++;
                    }
                } else if (a2[k] > a1[l1 - 1]) {
                    while (j < l1) {
                        a[i] = a1[j];
                        j++;
                    }
                } else if (a1[j] >= a2[k]) {
                    a[i] = a2[k];
                    k++;
                } else {
                    a[i] = a1[j];
                    j++;
                }
                i++;
            }

            for (int tmp : a) {
                System.out.print(tmp + " ");
            }


            t--;

        }


    }
}
