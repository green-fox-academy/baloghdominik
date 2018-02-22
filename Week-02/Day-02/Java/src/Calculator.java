import java.util.*;

public class Calculator {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type in the expression:");
        char operation = sc.next().charAt(0);
        System.out.println("Please type in the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Please type in second number:");
        double num2 = sc.nextDouble();
        double result = calculate(operation, num1, num2);

        if (result == 0.0000000099987654321) {
            System.out.println("Something went wrong!");
        } else {
            System.out.println(result);
        }


    }

    private static double calculate(char operation, double num1, double num2) {
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/' && num2 != 0) {
            result = num1 / num2;
        } else if (operation == '%') {
            result = num1 % num2;
        } else {
            result = 0.0000000099987654321;
        }
        return result;
    }


}