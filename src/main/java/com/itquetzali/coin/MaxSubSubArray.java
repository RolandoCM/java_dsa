package com.itquetzali.coin;

public class MaxSubSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 8};
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static int maxSubArray(int [] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
