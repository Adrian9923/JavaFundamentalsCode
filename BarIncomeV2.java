package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncomeV2 {

    static class Order{
        String customer;
        String product;
        double totalPrice;

        public Order(String customer, String product, double totalPrice) {
            this.customer = customer;
            this.product = product;
            this.totalPrice = totalPrice;
        }

        @Override
        public String toString() {
            return String.format("%s: %s - %.2f\n",this.customer,this.product,this.totalPrice);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalIncome = 0;
        List<Order> orders = new ArrayList<>();

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
                Order order = new Order(customer,product,totalPrice);
                orders.add(order);
            }

            command = scanner.nextLine();
        }

        for (Order order : orders) {
            System.out.print(order);
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
