package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter average books read per month (v):");
        int v = scanner.nextInt();

        System.out.print("Enter average number of visitors per year (n):");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Number of visitors must be greater than zero.");
        } else {
            double k = (12.0 * v) / n;
            System.out.printf("Average books read per visitor per year (k): %.2f%n", k);
        }

        scanner.close();
    }
}
