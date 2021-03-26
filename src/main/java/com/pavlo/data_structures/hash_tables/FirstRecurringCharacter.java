package com.pavlo.data_structures.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

    private static void findRecurringChar(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int number: arr) {
            if(set.contains(number)) {
                System.out.println(number);
                break;
            } else {
                set.add(number);
            }
        }
    }

    public static void main(String[] args) {
        findRecurringChar(new int[]{2,5,1,2,3,5,1,2,4});
        findRecurringChar(new int[]{2,1,3,5,1,2,4});
        findRecurringChar(new int[]{2,5,5,2,3,5,1,2,4});
    }
}
