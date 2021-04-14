package com.pavlo.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private void sort(int[] array, int leftIndex, int rightIndex) {
        if(leftIndex < rightIndex) {
            int pivotIndex = partition(array, leftIndex, rightIndex);
            sort(array, leftIndex, pivotIndex - 1);
            sort(array, pivotIndex + 1, rightIndex);
        }
    }

    private int partition(int[] array, int leftIndex, int rightIndex) {
        int pivotValue = array[rightIndex];
        int partitionIndex = leftIndex;
        for(int i = leftIndex; i < rightIndex; i++) {
            if (array[i] < pivotValue) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        System.out.println(Arrays.toString(array));
        swap(array, rightIndex, partitionIndex);
        System.out.println(Arrays.toString(array));
        return partitionIndex;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{99, 2, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        quickSort.sort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
