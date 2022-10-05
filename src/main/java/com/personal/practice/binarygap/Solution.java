package com.personal.practice.binarygap;

import java.util.Arrays;


/**
 * Find longest sequence of zeros in binary representation of an integer.
 */
public class Solution {

    public static void main (String[] args){
        Solution solution = new Solution();
        // Number 32
        String number = solution.convertToBinary(32);
        System.out.println(number);
        int[] binaryNumber = solution.getIntArrayFromString(number);
        System.out.println(Arrays.toString(binaryNumber));
        int maxGap = solution.findMaxGap(binaryNumber);
        System.out.println("max count :" + maxGap);

        //
    }
    public int findMaxGap (int[] binaryNumber){
        int zeroCounter = 0;
        int maxGap =0;
        for(int i=0; i< binaryNumber.length;i++){
            if(binaryNumber[i]==0) zeroCounter++;
            if(binaryNumber[i]==1){
                maxGap = Math.max(maxGap,zeroCounter);
                zeroCounter=0;

            }
        }
        return  maxGap;
    }
    public String convertToBinary(Integer number){
        return Integer.toBinaryString(number);
    }

    public int[] getIntArrayFromString(String number){
        int[] intArray = new int[number.length()];
        for (int i=0 ; i< number.length(); i++) {
           intArray[i] = Character.getNumericValue(number.toCharArray()[i]);
        }
        return  intArray;
    }
}
