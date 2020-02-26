package DataTypes;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System. in);
        int inputInt = scanner.nextInt();

        if (inputInt % 2 == 0){
            System.out.println(inputInt + " is a even Number");
        } else {
            System.out.println(inputInt +" is a odd Number");
        }

    }
}
