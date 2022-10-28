import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NewYearCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.nextLine());
        LocalDate newYear = LocalDate.of(date.getYear() + 1, 1,1);
        long days = ChronoUnit.DAYS.between(date, newYear);
        System.out.println(days);
    }
}
