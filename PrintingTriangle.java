import java.util.Scanner;

public class PrintingTriangle {
    static  void printTriangle(int width){
        for (int i = 1; i <= width ; i++) {
            printIncreasingSequence(i);
        }
        for (int i = width - 1; i >= 1 ; i--) {
            printIncreasingSequence(i);
        }
    }

     static void printIncreasingSequence(int last) {
         for (int i = 1; i <= last; i++) {
             System.out.print(i + " ");
         }
         System.out.println();

    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        printTriangle(width);
    }
}
