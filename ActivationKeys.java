package Exam;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] cmdParts = command.split(">>>");
            String action = cmdParts[0];
            switch (action) {
                case "Contains": {
                    String substring = cmdParts[1];
                    if (password.contains(substring)) {
                        System.out.printf("%s contains %s\n",password, substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                }
                case "Flip": {
                    String request = cmdParts[1];
                    int startIndex = Integer.parseInt(cmdParts[2]);
                    int endIndex = Integer.parseInt(cmdParts[3]);
                    String substring = password.substring(startIndex, endIndex);
                    switch (request) {
                        case "Upper": {
                            password = password.replaceAll(substring, substring.toUpperCase());
                            System.out.println(password);
                            break;
                        }
                        case "Lower": {
                            password = password.replaceAll(substring, substring.toLowerCase());
                            System.out.println(password);
                            break;
                        }
                    }
                    break;
                }
                case "Slice": {
                    int startIndex = Integer.parseInt(cmdParts[1]);
                    int endIndex = Integer.parseInt(cmdParts[2]);
                    String substring = password.substring(startIndex, endIndex);
                    password = password.replaceAll(substring, "");
                    System.out.println(password);
                    break;
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",password);
    }
}
