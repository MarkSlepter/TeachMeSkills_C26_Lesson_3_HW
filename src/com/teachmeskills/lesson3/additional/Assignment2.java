package com.teachmeskills.lesson3.additional;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select a shape: 1- rectangle, 2- triangle, 3- circle: ");
    int choice = scanner.nextInt();
    double area = 0.0;

    switch (choice) {
        case 1:
            System.out.println("Enter the length and width of the rectangle: ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            area = length * width;
            break;
        case 2:
            System.out.println("Enter the length of the triangle(a b c): ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double s = (a + b + c)/2;
            area = Math.sqrt(s* (s - a) * (s - b) * (s - c));
            break;
        case 3:
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            area = Math.PI * radius * radius;
            break;
        default:
            System.out.println("Wrong choice.");
            return;
    }

    System.out.println("Area of the selected figure: " + area);
    }

}
