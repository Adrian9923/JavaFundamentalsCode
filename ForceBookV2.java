package AssociativeArrays;

import java.util.*;

public class ForceBookV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> forceBook = new TreeMap<>();

        while (!input.equals("End")) {

            if (input.contains(" -> ")) {
                String[] token = input.split(" -> ");
                String forceSide = token[1];
                String forceUser = token[0];

                if (!contains(forceBook, forceUser)) {
                    for (Map.Entry<String, List<String>> current : forceBook.entrySet()) {
                        if (current.getValue().contains(forceUser)) {
                            forceBook.get(current.getKey()).remove(forceUser);
                            break;
                        }
                    }
                    if (!forceBook.containsKey(forceSide)){
                        forceBook.putIfAbsent(forceSide, new ArrayList<>());
                    }
                    forceBook.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
//                    if (!forceBook.containsKey(forceSide)) {
//                        forceBook.put(forceSide, new ArrayList<>());
//                    }
//                    forceBook.get(forceSide).add(forceUser);
//                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                } else {
                    for (List<String> list : forceBook.values()) {
                        list.remove(forceUser);
                    }

                    forceBook.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }

            } else {
                String[] token = input.split(" \\| ");
                String forceSide = token[0];
                String forceUser = token[1];

                    if (!forceBook.containsKey(forceSide)) {
                        forceBook.put(forceSide, new ArrayList<>());
                    }
                    if (!contains(forceBook, forceUser)) {
                        forceBook.get(forceSide).add(forceUser);
                    }

            }
            input = scanner.nextLine();
        }

        forceBook.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((f, s) -> {
                    int result = s.getValue().size() - f.getValue().size();
                    if (result == 0) {
                        return f.getKey().compareTo(s.getKey());
                    }
                    return result;
                }).forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream()
                            .sorted((f, s) ->
                                    f.compareTo(s))
                            .forEach(s -> System.out.println("! " + s));
                });
    }


    static boolean contains(Map<String, List<String>> map, String value) {
        for (List<String> list : map.values()) {
            if (list.contains(value)) return true;
        }
        return false;
    }
}
