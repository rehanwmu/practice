package com.personal.practice.cyclicrotation;

import java.util.Arrays;

public class Solution {

    public static void main(String[] arg) {
        int[] a = {3, 8, 9, 7, 6};
        int k = 3;
        Solution solution = new Solution();

        // Answer should be [9, 7, 6, 3, 8]
        System.out.println(Arrays.toString(solution.rotate(a, k)));

        /**
         * A = [1, 2, 3, 4]
         *  K = 4
         *  Answer should be  [1, 2, 3, 4]
         */
        int[] b = {1, 2, 3, 4};
        k = 4;

        // Answer should be [9, 7, 6, 3, 8]
        System.out.println(Arrays.toString(solution.rotate(b, k)));
    }

    public int[] rotate(int[] a, int k) {
        int dummy;
        for (int i = 0; i < k; i++) {
            dummy = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = dummy;
        }
        return a;
    }

    public int[] solution(int[] A, int K) {
        int [] rotatedA = new int[A.length];

        for(int i=0; i<A.length; i++) {
            //rotated index needs to "wrap" around end of array
            int rotatedIndex = (i + K) % A.length;

            rotatedA[rotatedIndex] = A[i];
        }
        return rotatedA;
    }
}
