package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());
        printResult(num1, operator, num2);

    }
    public static void printResult(int num1, char operator, int num2) {
        if (operator == '+'){
            System.out.print(num1 + num2);
        }else if (operator == '-') {
            System.out.print(num1 - num2);
        }else if (operator == '*') {
            System.out.print(num1 * num2);
        }else if (operator == '/') {
            System.out.print(num1 / num2);
        }
    }
}
