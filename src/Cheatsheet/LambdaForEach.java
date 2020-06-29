package Cheatsheet;

import java.util.Set;

public class LambdaForEach {
    public static void main(String[] args) {
        Set<String> names = Set.of("Tim", "John", "Sue", "Pete", "Mary");

        names.forEach(name -> System.out.println(name));
    }
}
