package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        while (n > 0) {
            int occurrences = 0;
            String deciphered = "";
            String message = scanner.nextLine();
            String regex = "S|s|T|t|A|a|R|r";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(message);
            for (int i = 0; i < message.length(); i++) {
                if (matcher.find()) {
                    occurrences++;
                }
            }
            for (int i = 0; i < message.length(); i++) {
                char symbol = message.charAt(i);
                deciphered += (char)(symbol - occurrences);
            }
            String regex2 = "@(?<planet>[A-Z][a-z]+)\\d?:(?<population>\\d+)!(?<action>[A-Z])!->(?<soldierCount>\\d+)";
            Pattern pattern1 = Pattern.compile(regex2);
            Matcher matcher1 = pattern1.matcher(deciphered);
            if (matcher1.find()) {
                String planet = matcher1.group("planet");
                int population = Integer.parseInt(matcher1.group("population"));
                String action = matcher1.group("action");
                int soldierCount = Integer.parseInt(matcher1.group("soldierCount"));
                switch (action) {
                    case "A": {
                        attackedPlanets.add(planet);
                        break;
                    }
                    case "D": {
                        destroyedPlanets.add(planet);
                        break;
                    }
                }
            }

            n--;
        }
        System.out.printf("Attacked planets: %d\n",attackedPlanets.size());
        attackedPlanets.stream().sorted().forEach(planet -> System.out.println("-> " + planet));

        System.out.printf("Destroyed planets: %d\n",destroyedPlanets.size());
        destroyedPlanets.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
    }
}
