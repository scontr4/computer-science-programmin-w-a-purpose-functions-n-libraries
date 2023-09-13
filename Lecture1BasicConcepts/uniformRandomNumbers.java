// Uniform random numbers. Write a program that prints five uniform random numbers between 0 and 1, 
// their average value, and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().

// For this exercise, use only Java features that we have introduced in this course so far (e.g,. no loops or conditionals).
import java.lang.Math;

class uniformRandomNumbers {

    public static void main(String[] args) {

        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double average = (a + b + c + d + e) / 5;
        double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        System.out.println("The average of the five random numbers is: " + average);
        System.out.println("The minimum of the five random numbers is: " + min);
        System.out.println("The maximum of the five random numbers is: " + max);
    }

}