import java.util.Scanner;

public class GreaterOfTwoValuesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                int resultInt = getMax(firstInt, secondInt);
                System.out.println(resultInt);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char resultChar = getMax(firstChar, secondChar);
                System.out.println(secondChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultString = getMax(firstString, secondString);
                System.out.println(resultString);
                break;
        }

    }

    private static int getMax (int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }

    private static char getMax(char first, char second){
        if (first > second){
            return  first;
        }
        return  second;
    }

    private static String getMax(String first, String second){
        int first1 = first.compareTo(second);
        if (first1 >= 0){
            return first;
        }

        return second;
    }
}
