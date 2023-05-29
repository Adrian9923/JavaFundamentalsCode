package TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        BigInteger result;
        result = num1.multiply(BigInteger.valueOf(num2));
        System.out.println(result);
    }
}
