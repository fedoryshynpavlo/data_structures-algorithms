package com.pavlo.algorithms.recursive;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("yoyo mastery"));
    }

    private static String reverse(String value) {
        if (value.equals("")) {
            return "";
        }
        return reverse(value.substring(1)) + value.charAt(0);
    }
}
