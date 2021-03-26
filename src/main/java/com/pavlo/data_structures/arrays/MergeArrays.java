package com.pavlo.data_structures.arrays;

import java.util.*;

public class MergeArrays {

    public static void main(String[] args) {
        mergeArrays(new int[]{5, 4, 31, 35, 37}, new int[]{4, 6, 30, 32, 33});
        mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30, 32, 33});
    }

    private static void mergeArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int k = 0;
        for (int firstArrayNumbers : firstArray) {
            mergedArray[k] = firstArrayNumbers;
            k++;
        }
        for (int secondArrayNumbers : secondArray) {
            mergedArray[k] = secondArrayNumbers;
            k++;
        }
        System.out.println("Merged: " + Arrays.toString(mergedArray));
        for (int j = 0; j < mergedArray.length; j++) {
            for (int n = j + 1; n < mergedArray.length; n++) {
                int temp = 0;
                if (mergedArray[j] > mergedArray[n]) {
                    temp = mergedArray[j];
                    mergedArray[j] = mergedArray[n];
                    mergedArray[n] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(mergedArray));
    }

    private static void mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < firstArray.length || j < secondArray.length) {
            if (i != firstArray.length && (j == secondArray.length || firstArray[i] < secondArray[j])) {
                mergedArray[k] = firstArray[i];
                ++i;
            } else {
                mergedArray[k] = secondArray[j];
                ++j;
            }
            k++;
        }
        System.out.println("Sorted: " + Arrays.toString(mergedArray));
    }
}
