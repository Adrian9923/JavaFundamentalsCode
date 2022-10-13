import java.util.Scanner;

public class SignOfIntegerNumber {
    public static void printNumberSignInfo(int n) {
        String signInfo = " ";
        if(n < 0)
            signInfo = "negative";
        if (n > 0)
            signInfo = "positive";
        if(n == 0)
            signInfo = "zero";

            System.out.println("The number " + n + " is " + signInfo + ".");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumberSignInfo(scanner.nextInt());

    }
}
