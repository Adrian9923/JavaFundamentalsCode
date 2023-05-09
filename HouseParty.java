package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> persons = new ArrayList<>();
        List<String> checkList = new ArrayList<>();

       /* String cmd = scanner.nextLine();
        String[] cmdParts = cmd.split(" ");
        System.out.println(cmdParts[1] + " " + cmdParts[2]);*/

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split(" ");

            for (int j = 0; j < persons.size(); j++) {
                if ((cmdParts[1] + " " + cmdParts[2]).equals("is going!")) {
                    if (cmdParts[0].equals(persons.get(j))) {
                        System.out.printf("%s is already in the list!\n", cmdParts[0]);
                    }else {
                        persons.add(cmdParts[0]);
                    }
                }else if ((cmdParts[1] + " " + cmdParts[2] + " " + cmdParts[3]).equals("is not going!")) {
                    if (cmdParts[0].equals(persons.get(j))) {
                        persons.remove(persons.get(j));
                    }else {
                        System.out.printf("%s is not in the list!\n",cmdParts[0]);
                    }
                }
            }
        }
        for (String person : persons) {
            System.out.print(person + " ");
        }

    }
}
