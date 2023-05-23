package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emails = scanner.nextLine();

        String regex = "\\b(?<username>[a-z]+\\d+)@(?<domain1>[a-z]+).(?<domain2>[a-z]+)\\b";
        //or [A-Za-z0-9]+[@][A-Za-z]+[.][a-z]+

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emails);
        while (matcher.find()) {
            System.out.printf("Username: %s, Domain1: %s, Domain2 : %s\n",
                    matcher.group("username"),
                    matcher.group("domain1"),
                    matcher.group("domain2"));
        }
        // This is not the final solution
    }
}
