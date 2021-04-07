package com.pavlo.algorithms.recursive;

import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(8));
        System.out.println(fibonacciIterative(8));
    }

    private static int fibonacciRecursive(int i) {
        if(i == 0) {
            return 0;
        }
        if(i == 1 || i == 2) {
            return 1;
        }
        return fibonacciRecursive(i - 2) + fibonacciRecursive(i - 1);
    }

    private static int fibonacciIterative(int i) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        fibonacci.add(1);
        for(int n = 3; n <= i; n++) {
            fibonacci.add(fibonacci.get(n-2) + fibonacci.get(n-1));
        }
        return fibonacci.get(i);
    }
}
