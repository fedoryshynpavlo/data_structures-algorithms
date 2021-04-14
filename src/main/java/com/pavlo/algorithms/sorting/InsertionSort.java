package com.pavlo.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    private int[] sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.println("Step [" + i + "] : " + Arrays.toString(array));
        }
        return array;
    }

    private ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i) <= array.get(0)) {
                array.add(0, array.remove(i));
            } else {
                if (array.get(i) < array.get(i - 1)) {
                    for (int j = 1; j < i; j++) {
                        if (array.get(i) < array.get(j)) {
                            array.add(j, array.remove(i));
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{99, 2, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(99, 2, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(numbers)));
        System.out.println(insertionSort.insertionSort(arrayList));
    }
}
