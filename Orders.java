package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = calcPrice(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        System.out.printf("%.2f",result);
    }
    public static double calcPrice(String product, int price){
        double totalPrice = 0;
        switch (product) {
            case "coffee": {
                totalPrice += price * 1.50;
                break;
            }
            case "water": {
                totalPrice += price * 1.0;
                break;
            }
            case "coke": {
                totalPrice += price * 1.40;
                break;
            }
            case "snacks": {
                totalPrice += price * 2;
                break;
            }
        }
        return totalPrice;
    }
}
