package DataTypes;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner.nextLine();

        System.out.println(inputString.substring(1,inputString.length())); // cut off first letter
        System.out.println(inputString.toUpperCase()); // to uppercase
        System.out.println(inputString.replace("a","Z")); // raplace A with Z
        System.out.println(inputString.concat("-ready"));
    }
}
