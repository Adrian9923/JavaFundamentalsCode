import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int times = scanner.nextInt();
        for (int i = times; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d X %d = %d\n",num,i,result);
        }
        if(times > 10){
            int result2 = num * times;
            System.out.printf("%d X %d = %d",num,times,result2);
        }

    }
}
