import java.util.Scanner;

public class Grades {
    static void receiveGrade(double grade){

        if(grade >= 2.00 && grade <= 2.99)
            System.out.println("Fail");
        if(grade >= 3.00 && grade <= 3.49)
            System.out.println("Poor");
        if(grade >= 3.50 && grade <= 4.49)
            System.out.println("Good");
        if(grade >= 4.50 && grade <= 5.49)
            System.out.println("Very good");
        if(grade >= 5.50 && grade <= 6.00)
            System.out.println("Excellent");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        receiveGrade(scanner.nextDouble());
    }
}
