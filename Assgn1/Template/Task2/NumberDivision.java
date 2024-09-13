package Assgn1.Template.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            // Read the two numbers from the user

            // Divide the first number by the second number
            double result = num1 / num2;
            // Display the result of the division
            System.out.println("The result is: "+ result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException and display an error message
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            // Handle the InputMismatchException and display an error message
            System.out.println("Error: Data type is invalid.");
        }

        scanner.close();
    }
}
