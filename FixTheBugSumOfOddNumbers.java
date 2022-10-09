import java.util.Scanner;

public class FixTheBugSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddNumber = 1;
        int sumOddNumbers = 0;
        for (int i = 0; i < n; i++) {
            sumOddNumbers += oddNumber;
            System.out.println(oddNumber);
            oddNumber += 2;
        }
        System.out.println("Sum: " + sumOddNumbers);
    }
}
