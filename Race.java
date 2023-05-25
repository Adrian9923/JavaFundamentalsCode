package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> racers = new TreeMap<>();
        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> winners = new ArrayList<>();


        String command = scanner.nextLine();

        while (!command.equals("end of race")) {
            String name = "";
            int sum = 0;
            String nameRegex = "[^\\d\\W]";
            String distanceRegex = "\\d";
            Pattern patternNames = Pattern.compile(nameRegex);
            Pattern patternDistance = Pattern.compile(distanceRegex);
            Matcher matcherNames = patternNames.matcher(command);
            Matcher matcherDistance = patternDistance.matcher(command);

            while (matcherDistance.find()) {
                sum += Integer.parseInt(matcherDistance.group());
            }

            while (matcherNames.find()) {
                name += matcherNames.group();
            }

            for (String participant : participants) {
                if (name.equals(participant)) {
                    if (!racers.containsKey(name)) {
                        racers.put(name, sum);
                    }else {
                        racers.put(name, racers.get(name) + sum);
                    }
                  //  break; ?
                }
            }

            command = scanner.nextLine();
        }

        racers.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed())
                .limit(3)
                .forEach(racer -> winners.add(racer.getKey()));

        System.out.printf("1st place: %s\n" +
                        "2nd place: %s\n" +
                        "3rd place: %s\n",
                winners.get(0),
                winners.get(1),
                winners.get(2));

    }
}
