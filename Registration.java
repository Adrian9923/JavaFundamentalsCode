package ExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int successfulRegistrations = 0;
        int registrationsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < registrationsCount; i++) {
            String command = scanner.nextLine();
            String regex = "U\\$(?<username>[A-Z]{1}[a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}[0-9]+)P@\\$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            if (matcher.find()) {
                System.out.println("Registration was successful");
                successfulRegistrations++;
                String username = matcher.group("username");
                String password = matcher.group("password");
                System.out.printf("Username: %s, Password: %s\n",username,password);
            }else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + successfulRegistrations);
    }
}
