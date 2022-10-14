import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        repeatString(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }

    static void repeatString(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }

    }
}
