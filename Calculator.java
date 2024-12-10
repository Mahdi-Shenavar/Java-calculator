import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        double result = 0;
        boolean validOperation = true;

        // Perform calculation AFTER getting all input
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default: 
                System.out.println("Error: Invalid operator!");
                validOperation = false;
        }

        if (validOperation) {
            Thread.sleep(1800); // Delay AFTER calculation and input
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}