package lw1;

import java.util.Scanner;

public class lab1_2 {
    public static String getTimeOfYear(int month) {
        if (month < 3 || month == 12) {
            return ("Winter");
        } else if (month < 6) {
            return ("Spring");
        } else if (month < 9) {
            return ("Summer");
        }
        return ("Autumn");
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int day, month;

            System.out.print("Day: ");
            day = scanner.nextInt();

            System.out.print("Month: ");
            month = scanner.nextInt();

            if (month == 2 && day > 29 || day > 31) {
                throw new Exception("Invalid Input");
            }

            System.out.println(getTimeOfYear(month));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}