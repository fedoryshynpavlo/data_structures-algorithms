package com.pavlo.algorithms.recursive;

public class Factorial {

    private static int findFactorialIterative(int i) {
        int result = 1;
        if (i == 0) {
            return i;
        }
        for (int n = i; n > 0; n--) {
            result *= n;
        }
        return result;
    }

    private static int findFactorialRecursive(int i) {
        if (i == 1) {
            return i;
        }
        return i * findFactorialRecursive(i - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorialRecursive(5));
        System.out.println(findFactorialIterative(5));
    }
}
