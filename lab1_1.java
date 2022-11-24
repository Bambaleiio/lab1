package lw1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, month, year;
        System.out.print("Day of birth: ");
        day = scanner.nextInt();
        System.out.print("Month of birth: ");
        month = scanner.nextInt();
        System.out.print("Year of birth: ");
        year = scanner.nextInt();

        try {
            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            LocalDate now = LocalDate.now();

            Period diff = Period.between(dateOfBirth, now);

            if (diff.isNegative()) {
                throw new Exception("Date of birth greater than today's date");
            }

            System.out.printf("%d years, %d months and %d days",
                    diff.getYears(), diff.getMonths(), diff.getDays());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
