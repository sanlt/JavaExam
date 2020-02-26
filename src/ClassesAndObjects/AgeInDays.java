package ClassesAndObjects;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.DAYS;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        int year;
        int month;
        int day;
        long diffDays;


        System.out.println("In which year were you born?");
        year = scanner.nextInt();
        System.out.println("In which month were you born?");
        month = scanner.nextInt();
        System.out.println("On which day of the month were you born?");
        day = scanner.nextInt();
        System.out.println("Your were born on " + year + "-" + month + "-" + day);
        LocalDate date =  LocalDate.of(year,month,day);
        System.out.println("Today is " + today);
        diffDays = ChronoUnit.DAYS.between(date,today);
        System.out.println("You are " + diffDays + " days old.");


    }
}
