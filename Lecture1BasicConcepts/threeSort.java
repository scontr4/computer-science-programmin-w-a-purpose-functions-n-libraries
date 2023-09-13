// Three-sort. Write a program that takes three integer command-line arguments and prints them in ascending order. Use Math.min() and Math.max().
// For this exercise, use only Java features that we have introduced in this course so far (e.g,. no loops or conditionals).

import java.lang.Math;

public class threeSort {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int med = a + b + c - min - max;

        System.out.println(min + " " + med + " " + max);

    }

}