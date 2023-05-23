package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalMoneySpent = 0;

        String command = scanner.nextLine();


        while (!command.equals("Purchase")) {
            String regex = ">>(?<furniture>\\w+)<<(?<price>(\\d+)(\\.\\d+)?)!(?<quantity>\\d)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            while (matcher.find()) {
                furniture.add(matcher.group("furniture"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalMoneySpent += price * quantity;
            }

            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : furniture) {
            System.out.println(s);
        }
        System.out.printf("Total money spent: %.2f",totalMoneySpent);
    }
}
