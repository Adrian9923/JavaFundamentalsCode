import java.util.Arrays;
import java.util.Scanner;

public class SameElementArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Yes" : "No");
    }

}
