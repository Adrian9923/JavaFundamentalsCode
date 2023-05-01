package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonNoGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonDistance = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemovedElements = 0;
        int i = 0;

        while (!pokemonDistance.isEmpty()) {
            int command = Integer.parseInt(scanner.nextLine());
            sumRemovedElements += pokemonDistance.get(command);
            if (pokemonDistance.get(i) < pokemonDistance.get(command)) {
                pokemonDistance.set(i,pokemonDistance.get(i) + pokemonDistance.get(command));
                pokemonDistance.remove(command);
                i = -1;
            }else {
                pokemonDistance.set(i,pokemonDistance.get(i) - pokemonDistance.get(command));
                pokemonDistance.remove(command);
                i = -1;
            }
            i++;
        }
        System.out.println(sumRemovedElements);
    }
}
