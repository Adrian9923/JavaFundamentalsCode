import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(range[0]);
        int num2 = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]\n", num1, num2);
        while (true) {
            String inputLine = scanner.nextLine();
            try {
                int number = Integer.parseInt(inputLine);
                if (number >= num1 && number <= num2) {
                    System.out.printf("Valid number: %d\n", number);
                    break;
                } else
                    System.out.printf("Invalid number: %d\n", number);

            } catch (Exception ex) {
                System.out.printf("Invalid number: %s\n", inputLine);
            }
        }
    }
}
