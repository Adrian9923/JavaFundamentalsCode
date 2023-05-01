package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] cmdParts = command.split(" ");
            if (cmdParts[0].equals("Add")){
                passengers.add(Integer.parseInt(cmdParts[1]));
            }
            else {
                int persons = Integer.parseInt(cmdParts[0]);
                for (int i = 0; i < passengers.size(); i++) {
                    if (persons + passengers.get(i) <= maxCapacity){
                        passengers.set(i,persons + passengers.get(i));
                        break;
                    }
                }
            }
                command = scanner.nextLine();
        }
        for (Integer passenger : passengers) {
            System.out.print(passenger + " ");
        }

    }
}
