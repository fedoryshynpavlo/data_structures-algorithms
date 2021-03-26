package com.pavlo.data_structures.arrays;

import java.util.*;

public class TwoSum {

    private static void twoSumBF(int[] numbers, int target) {
        for (int k = 0; k < numbers.length; k++) {
            for (int i = k + 1; i < numbers.length; i++) {
                if (numbers[i] == target - numbers[k]) {
                    System.out.println("[" + k + "," + i + "]");
                }
            }
        }
    }

    private static void twoSum(int[] numbers, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int compliment = target - numbers[i];
            if (num.containsKey(compliment)) {
                System.out.println("[" + num.get(compliment) + "," + i + "]");
            }
            num.put(numbers[i], i);
        }
    }

    public static void main(String[] args) {
        twoSumBF(new int[]{2, 7, 11, 15}, 9);
        twoSumBF(new int[]{3, 2, 4}, 6);
        twoSumBF(new int[]{3, 3}, 6);
        twoSum(new int[]{2, 7, 11, 15}, 9);
        twoSum(new int[]{3, 2, 4}, 6);
        twoSum(new int[]{3, 3}, 6);
    }
}
