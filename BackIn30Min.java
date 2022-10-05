import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        minutes += 30;
        int prevMinutes = 0;
        if(minutes >= 60){
            hours++;
            prevMinutes = minutes - 60;
            if(hours > 23){
                System.out.printf("0:%d",prevMinutes);
                return;
            }
            if(prevMinutes < 10)
            System.out.printf("%d:0%d",hours,prevMinutes);
            else {
                System.out.printf("%d:%d",hours,prevMinutes);
            }

        }
        else {
            System.out.printf("%d:%d",hours,minutes);
        }
    }
}
