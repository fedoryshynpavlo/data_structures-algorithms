package com.pavlo.data_structures;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);
        numbers.add(9);
        int sum = 18;
        System.out.println(findPair(numbers, sum));
        System.out.println(findPairSet(numbers, sum));
        System.out.println(reverse("!olleh"));
    }

    private static boolean findPair(List<Integer> numbers, Integer sum) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findPairSet(List<Integer> numbers, Integer sum) {
        Set<Integer> mySet = new HashSet<>();
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            if (mySet.contains(numbers.get(i))) {
                return true;
            }
            mySet.add(sum - numbers.get(i));
        }
        return false;
    }

    private static String reverse(String stringToReverse) {
        char[] stringArray = stringToReverse.toCharArray();
        if (stringArray.length < 2) {
            return stringToReverse;
        }
        char[] reversedArray = new char[stringArray.length];
        int j = 0;
        for (int i = stringArray.length - 1; i >= 0; i--) {
            reversedArray[j] = stringArray[i];
            j++;
        }
        return String.valueOf(reversedArray);
    }
}
