package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + calculator.add(a, b));
        System.out.println("Subtraction = " + calculator.subtract(a, b));
        System.out.println("Multiplication = " + calculator.multiply(a, b));

        try {
            System.out.println("Division = " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}