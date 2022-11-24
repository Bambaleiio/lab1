package lw1;

import java.util.Scanner;

public class second {
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
        Scanner scanner = new Scanner(System.in);
        int day, month;

        System.out.print("Day: ");
        day = scanner.nextInt();

        System.out.print("Month: ");
        month = scanner.nextInt();

        System.out.println(getTimeOfYear(month));
    }
}