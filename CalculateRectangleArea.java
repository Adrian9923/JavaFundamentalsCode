import java.util.Scanner;

public class CalculateRectangleArea {

    static int returnRectangleArea(int width, int height) {
        int area = width * height;
       return area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(returnRectangleArea(scanner.nextInt(), scanner.nextInt()));
    }
}
