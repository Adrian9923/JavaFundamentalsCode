package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        printCalculation(line, num1, num2);
    }
    public static void printCalculation(String line , int num1, int num2) {
        if (line.equals("add")){
            int result = num1 + num2;
            System.out.println(result);
        }
        else if (line.equals("subtract")){
            int result = num1 - num2;
            System.out.println(result);
        }
        else if (line.equals("multiply")){
            int result = num1 * num2;
            System.out.println(result);
        }
        else if (line.equals("divide")){
            int result = num1 / num2;
            System.out.println(result);
        }
    }
}
