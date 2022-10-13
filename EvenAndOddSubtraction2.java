import java.util.Scanner;

public class EvenAndOddSubtraction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int[] numbers = new int[elements.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
        int sumEven = 0;
        int sumOdd = 0;
        int maxDiff = 0;
        for (int number : numbers){
            if(number % 2 == 0){
                sumEven += number;
            }else
                sumOdd += number;
        maxDiff = sumEven - sumOdd;
    }
        System.out.println(maxDiff);


    }
}
