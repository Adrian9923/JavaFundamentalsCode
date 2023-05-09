package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int result = returnSum(num1,num2) - subtractNum(num3);
        System.out.println(result);
    }

    public static int returnSum(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtractNum(int num3) {
        return num3;
    }
}
