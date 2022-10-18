import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(" ");
        for (String item : items) {
            if(item.length() % 2 == 0){
                System.out.println(item);
            }
        }


    }
}
