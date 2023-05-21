package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String barCode = scanner.nextLine();
            String regex = "@#{1,}[A-Z][A-Za-z0-9]+[A-Z]@#{1,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barCode);
            if (matcher.find()) {
                String temp = matcher.group();
                String productGroup = "";
                for (int j = 0; j < temp.length(); j++) {
                    char digit = temp.charAt(j);
                    if (Character.isDigit(digit)) {
                        productGroup += digit;
                    }
                }
                if (productGroup.isEmpty()) {
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + productGroup);
                }
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
