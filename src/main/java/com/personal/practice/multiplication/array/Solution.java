package com.personal.practice.multiplication.array;

/**
 *  Multiplication of
 */
public class Solution {
    public int solution(int[] A) {
        int product = 1;
        for(int i=0 ; i< A.length; i++){
            product = product * A[i];
        }

        return Integer.signum(product);
    }
}
