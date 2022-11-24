package lw1;

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

        System.out.println(pow(x, n));
    }
}
