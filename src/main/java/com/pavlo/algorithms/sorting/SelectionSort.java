package com.pavlo.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    private int[] sort(int[] array) {
        int length = array.length;
        for(int i = 0; i < length; i++) {
            int min = i;
            int temp = array[i];
            for(int j = i + 1; j < length; j++){
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
            System.out.println("Step [" + i + "]" + Arrays.toString(array));
        }

        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{99, 2, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(numbers)));
    }
}
