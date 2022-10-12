import java.util.Scanner;

public class ReverseArrayOfStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        for (int i = 0; i < strings.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = strings.length - 1 - i;

            String oldLeft = strings[leftIndex];
            strings[leftIndex] = strings[rightIndex];
            strings[rightIndex] = oldLeft;
        }
        System.out.println(String.join(" ",strings));

    }
}
