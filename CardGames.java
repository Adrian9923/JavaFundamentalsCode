package Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1Deck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> player2Deck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int i = 0;
            while (!(player1Deck.size() == 0 || player2Deck.size() == 0)) {
                if (player1Deck.get(i) > player2Deck.get(i)) {
                    player1Deck.add(player2Deck.get(i));
                    player1Deck.add(player1Deck.get(i));
                    player1Deck.remove(player1Deck.get(i));
                    player2Deck.remove(player2Deck.get(i));
                    i = -1;
                }else if (player2Deck.get(i) > player1Deck.get(i)) {
                    player2Deck.add(player1Deck.get(i));
                    player2Deck.add(player2Deck.get(i));
                    player2Deck.remove(player2Deck.get(i));
                    player1Deck.remove(player1Deck.get(i));
                    i = -1;
                }else if (player1Deck.get(i) == player2Deck.get(i)) {
                    player1Deck.remove(player1Deck.get(i));
                    player2Deck.remove(player2Deck.get(i));
                    i = -1;
                }

                i++;

            }
            int sum = 0;

        if (player1Deck.isEmpty()) {
            for (Integer integer : player2Deck) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }else {
            for (Integer integer : player1Deck) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }

    }
}
