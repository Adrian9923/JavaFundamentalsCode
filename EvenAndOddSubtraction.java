import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int maxDiff = 0;
        String[] elements = scanner.nextLine().split(" ");
        int[] numbers = new int[elements.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
            if(numbers[i] % 2 == 0){
                sumEven += numbers[i];
            }else
                sumOdd += numbers[i];
            maxDiff = sumEven - sumOdd;
        }
        System.out.println(maxDiff);
    }
}
