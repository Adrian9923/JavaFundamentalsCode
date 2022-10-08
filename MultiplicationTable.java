import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int times = 1;
        while (times <= 10){
            int result = num * times;
            System.out.printf("%d X %d = %d\n",num,times,result);
            times++;
        }
    }
}
