package com.pavlo.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {


    private List<Integer> sort(List<Integer> array) {
        int length = array.size();
        if (array.size() == 1) {
            return array;
        }
        List<Integer> left = array.subList(0, length/2);
        List<Integer> right = array.subList(length/2, length);
        return merge(sort(left), sort(right));
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }
        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));
        return result;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(99, 2, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
        System.out.println(mergeSort.sort(numbers));
    }
}
