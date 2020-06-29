package Cheatsheet;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static void main(String[] args) {

        int age = 18;

        String firstName = "Hans";
        String lastName = "Muster";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        List<String> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myList.add(fullName);
        }

        while (myList.size() != 0) {
            myList.remove(0);
        }



        // myList.subList(2,4);
        System.out.println(myList);

    }
}
