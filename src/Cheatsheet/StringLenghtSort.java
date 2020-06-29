package Cheatsheet;

import java.util.Arrays;
import java.util.Comparator;

public class StringLenghtSort {
    static String[] names = {"Tim", "John", "Sue", "Peter", "Mary"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(names));
        // Anonymous class
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        // Lambda expression
        Arrays.sort(names, (s1,s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(names));
    }
}
