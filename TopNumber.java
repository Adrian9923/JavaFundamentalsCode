package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        topNumber(num);
    }

    public static void topNumber(int num) {
        int sumDigits = 0;
        for (int i = 1; i <= num; i++) {
            int temp = i;
            while (temp > 0) {
                int lastDigit = temp % 10;
                sumDigits += lastDigit;
                temp /= 10;
            }
            if (sumDigits % 8 == 0) {
                int temp2 = i;
                while (temp2 > 0) {
                    int lastDigit = temp2 % 10;
                    if (lastDigit % 2 == 1) {
                        System.out.println(i);
                        break;
                    }
                    temp2 /= 10;
                }
            }
            sumDigits = 0;
        }
    }
}
