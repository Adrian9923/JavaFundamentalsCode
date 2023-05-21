package ExamPrep;

import java.util.Scanner;

public class PasswordResetV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("Done")) {
            String[] tokens = inputCommand.split("\\s+");
            String command = tokens[0];

            if (command.equals("TakeOdd")) {
                StringBuilder tempPass = new StringBuilder();

                for (int i = 1; i < password.length(); i += 2) {
                    tempPass.append(password.charAt(i));
                }
                password = tempPass.toString();
                System.out.println(password);
            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(tokens[1]);
                int length = Integer.parseInt(tokens[2]);

                String firstPart = password.substring(0, index);
                String secondPart = password.substring(index + length);

                password = firstPart + secondPart;
                System.out.println(password);
            } else if (command.equals("Substitute")) {
                String substring = tokens[1];
                String replacement = tokens[2];

                if (!password.contains(substring)) {
                    System.out.println("Nothing to replace!");
                }else {
                    password = password.replaceAll(substring, replacement);
                    System.out.println(password);
                }
            }

            inputCommand = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
