package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalIncome = 0;

        while (!command.equals("end of shift")) {

            String regex = "%(?<customer>[A-Z][a-z]+)%(\\w+)?<(?<product>[A-Z][a-z]+)>(\\w+)?\\|(?<count>\\d+)\\|([a-z]+)?(?<price>\\d+(\\.?)\\d+)\\$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);

            while (matcher.find()) {
                double totalPrice;
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                totalPrice = count * price;
                totalIncome += totalPrice;
                System.out.printf("%s: %s - %.2f\n", customer, product, totalPrice);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
