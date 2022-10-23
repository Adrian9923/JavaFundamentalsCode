import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInfo {

    static class Car {
        String brand;
        String model;
        int horsePower;

        String asString(){
            return String.format("%s:%s:%d",brand,model,horsePower);
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        Car car = new Car();

        car.setBrand(scanner.nextLine());
        car.setModel(scanner.nextLine());
        car.setHorsePower(scanner.nextInt());

        cars.add(car);
        for (Car car1 : cars) {
            System.out.println(car1.asString());
        }


    }
}
