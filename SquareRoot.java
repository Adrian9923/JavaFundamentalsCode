import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        try {
            int num = Integer.parseInt(inputLine);
            if(num < 0){
                System.out.println("Invalid");
                return;
            }
            double result = Math.sqrt(num);
            System.out.printf("%.2f\n", result);
        }catch (Exception ex){
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");
        }
    }
}
