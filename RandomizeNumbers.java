import java.util.*;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (true){
            String inputLine = scanner.nextLine();
            if(inputLine.equals("End"))
                break;

            int num  = Integer.parseInt(inputLine);
            numbers.add(num);
        }
        Collections.shuffle(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
