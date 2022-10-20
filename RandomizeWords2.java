import java.util.*;

public class RandomizeWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        Random rng = new Random();

        for (int i = 0; i < words.size(); i++) {
           int index =  rng.nextInt(words.size());

          String word =  words.remove(index);
          words.add(word);
        }
        for (String word : words) {
            System.out.println(word);
        }

    }
}
