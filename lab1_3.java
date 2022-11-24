package lw1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class lab1_3 {
    public static double pow(int base, int exp) {
        double res = 1;
        if (exp > 0) {
            for (int i = 1; i <= exp; i++) {
                res *= base;
            }
        } else {
            for (int i = 1; i <= -exp; i++) {
                res /= base;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n;
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("n: ");
        n = scanner.nextInt();

        if (x == 0 && n < 0) {
            System.out.println("Invalid Input");
        } else {
            DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            df.setMaximumFractionDigits(340);
            System.out.println(df.format(pow(x, n)));
        }
    }
}
