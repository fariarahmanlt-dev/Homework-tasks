package task4;

import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: Side lengths must be greater than zero.");
        } else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Error: The given sides do not form a valid triangle.");
        } else {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s -b) * (s - c));

            System.out.printf("Area of the triangle: %.2f\n",area);
        }
        scanner.close();
    }
}


