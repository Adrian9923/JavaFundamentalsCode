import java.util.Scanner;

public class ConvertMetersToKilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = scanner.nextInt();
        double kilometres = meters / 1000.0;
        System.out.printf("%.2f",kilometres);
    }
}
