import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();
        if(countryName.equals("England") || countryName.equals("USA"))
            System.out.println("English");
        else if(countryName.equals("Spain") || countryName.equals("Argentina") || countryName.equals("Mexico"))
            System.out.println("Spanish");
        else
            System.out.println("unknown");
    }
}
