package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        long factorialNum1 = calcFactorial(num1);
        long factorialNum2 = calcFactorial(num2);
        double result = (double)factorialNum1 / factorialNum2;
        System.out.printf("%.2f",result);
    }

    public static long calcFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
