package Methods;

import java.util.Scanner;

public class MathOperationsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());
        int result = printResult(num1,operator,num2);
        System.out.println(result);

    }
    public static int printResult(int num1, char operator, int num2) {
        int result = 0;
        if (operator == '+'){
            result = num1 + num2;
        }else if (operator == '-') {
            result = num1 - num2;
        }else if (operator == '*') {
            result = num1 * num2;
        }else if (operator == '/') {
            result = num1 / num2;
        }
        return result;
    }
}
