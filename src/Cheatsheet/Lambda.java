package Cheatsheet;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static List<Integer> list;

    public static void threeTimes() {
        list.replaceAll(x -> 3*x);
    }

    /*
    public static void sort() {
        list.sort(list.get(0).compareTo(list.get(1)));

    }

     */

    public static void rightDigit() {
        list.replaceAll(x -> x%10);
    }

    public static void square() {
        list.replaceAll(x -> x*x);
    }

    public static void main(String[] args) {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(42);
        list.add(155);

        System.out.println(list);
        threeTimes();
        System.out.println(list);
        rightDigit();
        System.out.println(list);
        square();
        System.out.println(list);
    }

}

