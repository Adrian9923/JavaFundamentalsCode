import java.math.BigDecimal;
import java.util.Scanner;

public class MathPower3 {
    static BigDecimal getPowerNumber(BigDecimal number, int powNumber) {

        number = number.pow(powNumber);
        return number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal number =new BigDecimal(scan.nextLine());
        int powNumber = Integer.parseInt(scan.nextLine());

        BigDecimal result = getPowerNumber(number, powNumber);
        System.out.println(result);
    }
}
