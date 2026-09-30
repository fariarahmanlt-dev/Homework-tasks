package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter room length: ");
        int length = scanner.nextInt();

        System.out.print("Enter room width: ");
        int width = scanner.nextInt();

        System.out.print("Enter price per tile area: ");
        double price = scanner.nextDouble();

        if (length <=0 || width <=0 || price <=0){
            System.out.println("Enter: Length, width, and price must be greater than zero.");

        } else {
            double area = length * width;
            double baseCost = area * price;

            double totalCost = baseCost * 1.05;

            System.out.printf("Total amount required (including 5%% waste): %.2f\n", totalCost);
        }
        scanner.close();
    }
}
