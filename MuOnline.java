package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> dungeonRooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int hp = 100;
        int bitcoins = 0;
        int roomsReached = 0;
        int foundBitcoins;
        int currentHp = 0;

        for (int i = 0; i < dungeonRooms.size(); i++) {
            if (hp <= 0) {
                System.out.printf("Best room: %d",roomsReached);
                break;
            }
            String command = dungeonRooms.get(i);
            String[] cmdParts = command.split(" ");
            switch (cmdParts[0]) {
                case "potion": {
                    if (hp < 100) {
                        hp += Integer.parseInt(cmdParts[1]);
                        if (hp > 100) {
                            currentHp -= 100;
                            hp = 100;
                            System.out.printf("%d health points restored.\n",-currentHp);
                        }else {
                            System.out.printf("%d health points restored.\n", Integer.parseInt(cmdParts[1]));
                        }
                        System.out.printf("Current health: %d hp.\n",hp);
                    }
                    roomsReached++;
                    break;
                }
                case "chest": {
                    foundBitcoins = Integer.parseInt(cmdParts[1]);
                    bitcoins += Integer.parseInt(cmdParts[1]);
                    System.out.printf("You found %d bitcoins.\n",foundBitcoins);
                    roomsReached++;
                    break;
                }
                default: {
                    int damageTaken = Integer.parseInt(cmdParts[1]);
                    hp -= damageTaken;
                    currentHp = hp;
                    if (hp > 0) {
                        System.out.printf("You have slayed a %s.\n",cmdParts[0]);
                    }else {
                        System.out.printf("You died! Killed by %s.\n",cmdParts[0]);
                    }
                    roomsReached++;
                    break;
                }
            }
        }
        if (roomsReached == dungeonRooms.size()) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n",bitcoins);
            System.out.printf("Health: %d\n",hp);
        }

    }
}
