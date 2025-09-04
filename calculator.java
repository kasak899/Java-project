import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");

        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result;

        
        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice! Please enter 1-4.");
        }

        sc.close();
    }
}