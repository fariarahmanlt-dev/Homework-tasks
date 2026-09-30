package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y1 - y2);

        if (width == 0 || height == 0) {
            System.out.println("Enter: The points do not from a valid rectangle.");

        } else {
            int s = width * height;
            int p = 2 * (width + height);

            System.out.println("s = " + s + " and p = " + p);

        }

        scanner.close();
    }
}
