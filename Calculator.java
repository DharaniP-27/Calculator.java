import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;
            boolean valid = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, *, or /.");
                    valid = false;
            }

            if (valid) {
                System.out.print("Do you want to perform another calculation? (y/n): ");
                option = sc.next().charAt(0);
            } else {
                option = 'y'; // To retry in case of invalid operator or divide by 0
            }

        } while (option == 'y' || option == 'Y');

        System.out.println("Thank you! Calculator exited.");
        sc.close();
    }
}