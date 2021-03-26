package com.pavlo.data_structures.arrays;

class LongestWord {

    public static String longestWord(String sentence) {
        if (sentence == null) {
            return "empty";
        }
        String result = "";
        String[] words = sentence.split(" ");
        int j = 0;
        for (int i = j + 1; i < words.length; i++) {
            if (words[i].length() >= words[j].length()) {
                result = words[i];
                j++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.print(longestWord("goes here Argument about biggest wordinthissentense bro"));
    }

}