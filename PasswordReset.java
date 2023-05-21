package ExamPrep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = "";
        String command = scanner.nextLine();
        while (!command.equals("Done")) {

            if (command.equals("TakeOdd")) {
                for (int i = 0; i < input.length(); i++) {
                    if (i % 2 == 1) {
                        char letter = input.charAt(i);
                        result += letter;
                    }
                }
                System.out.println(result);
            }else {
                String[] cmdParts = command.split(" ");
                switch (cmdParts[0]) {
                    case "Cut": {
                        int index = Integer.parseInt(cmdParts[1]);
                        int length = Integer.parseInt(cmdParts[2]);
                        String extracted = result.substring(index,index + length);
                        result = result.replace(extracted,"");
                        System.out.println(result);
                        break;
                    }
                    case "Substitute": {
                        String substring = cmdParts[1];
                        String substitute = cmdParts[2];
                        if (result.contains(substring)){
                            result = result.replace(substring, substitute);
                            System.out.println(result);
                        }else {
                            System.out.println("Nothing to replace!");
                        }
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + result);
    }
}
