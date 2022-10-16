import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            String products = scanner.nextLine();
            productsList.add(products);
        }
        Collections.sort(productsList);
        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s\n",i + 1, productsList.get(i));
        }
    }
}
