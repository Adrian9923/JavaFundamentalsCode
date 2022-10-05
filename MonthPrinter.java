import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        if(month.equals("1"))
            System.out.println("January");
        else if(month.equals("2"))
            System.out.println("February");
        else if(month.equals("3"))
            System.out.println("March");
        else if(month.equals("4"))
            System.out.println("April");
        else if(month.equals("5"))
            System.out.println("May");
        else if(month.equals("6"))
            System.out.println("June");
        else if(month.equals("7"))
            System.out.println("July");
        else if(month.equals("8"))
            System.out.println("August");
        else if(month.equals("9"))
            System.out.println("September");
        else if(month.equals("10"))
            System.out.println("October");
        else if(month.equals("11"))
            System.out.println("November");
        else if(month.equals("12"))
            System.out.println("December");
        else
            System.out.println("Error!");
    }
}
