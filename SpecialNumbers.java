import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumDigits = 0;
        for (int i = 1; i <= n; i++) {
            int same = i;
            while (same > 0){
                int lastDigit = same % 10;
                sumDigits += lastDigit;
                same /= 10;
            }
            if(sumDigits == 5 || sumDigits == 7 || sumDigits == 11)
            System.out.printf("%d -> True\n",i);
            else
                System.out.printf("%d -> False\n",i);
            sumDigits = 0;
        }
    }
}
