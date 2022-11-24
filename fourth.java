package lw1;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfPoints, answer = 0;
        double radius;

        System.out.print("Amount of points: ");
        amountOfPoints = scanner.nextInt();
        System.out.print("Circle radius: ");
        radius = scanner.nextDouble();

        for (int num = 1; num <= amountOfPoints; num++) {
            double x, y;
            System.out.printf("X of the %d point: ", num);
            x = scanner.nextDouble();
            System.out.printf("Y of the %d point: ", num);
            y = scanner.nextDouble();

            answer += x * x + y * x <= radius * radius ? 1 : 0;
        }

        System.out.println(answer + " points inside circle");
    }
}
