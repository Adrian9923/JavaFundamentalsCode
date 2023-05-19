package ObjectAndClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());
        System.out.println(num1.add(num2));

      /*  BigDecimal num3 = new BigDecimal(scanner.nextLine());
        BigDecimal num4 = new BigDecimal(scanner.nextLine());
        System.out.println(num3.add(num4)); */
    }
}
