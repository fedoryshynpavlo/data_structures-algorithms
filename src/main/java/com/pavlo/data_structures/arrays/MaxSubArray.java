package com.pavlo.data_structures.arrays;

public class MaxSubArray {

    private static void maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;
        for (int n : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += n;
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }

}
