import java.util.Random;
import java.util.Scanner;

public class RandomNumberInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        Random randomNumber = new Random();
        int result = randomNumber.nextInt(start, end + 1);
        System.out.println(result);
    }
}
