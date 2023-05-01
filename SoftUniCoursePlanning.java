package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courses = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] cmdParts = command.split(":");
            switch (cmdParts[0]) {
                case "Add": {
                    courses.add(cmdParts[1]);
                    break;
                }
                case "Insert": {
                    courses.add(Integer.parseInt(cmdParts[2]),cmdParts[1]);
                    break;
                }
                case "Remove": {
                    for (int i = 0; i < courses.size(); i++) {
                        if (courses.get(i).equals(cmdParts[1])){
                            courses.remove(courses.get(i));
                        }
                    }
                    break;
                }
                case "Swap": {

                }
            }


            command = scanner.nextLine();
        }
        int index = 1;
        for (String cours : courses) {
            System.out.printf("%d.%s\n",index,cours);
            index++;
        }


    }
}
