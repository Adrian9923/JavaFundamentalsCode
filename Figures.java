import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Movable{
    void move(int deltaX, int deltaY);
}
abstract class Figure implements Movable{
    protected int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
    public abstract double calcArea();
}
class Rectangle extends Figure{
    protected double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle(width=%.2f, height=%.2f, area=%.2f)",this.width,this.height,this.calcArea());

    }
}

class Circle extends  Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.2f, area=%.2f)",this.radius, this.calcArea());
    }

}
class FilledRectangle extends Rectangle{
    private String color;
    public FilledRectangle(double width, double height, String color) {
        super(width, height);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("FilledRectangle(width=%.2f, height=%.2f, color=%s, area=%.2f)",this.width, this.height, this.color, this.calcArea());
    }
}


public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Figure> figures = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            String[] inputParts = input.split(" ");
            if (inputParts[0].equals("circle")){
                double radius = Double.parseDouble(inputParts[1]);
                figures.add(new Circle(radius));
            }
            else if(inputParts[0].equals("rect")){
                double width = Double.parseDouble(inputParts[1]);
                double height = Double.parseDouble(inputParts[2]);
                figures.add(new Rectangle(width, height));

            }
            else if (inputParts[0].equals("fillRect")){
                double width = Double.parseDouble(inputParts[1]);
                double height = Double.parseDouble(inputParts[2]);
                String color = inputParts[3];
                figures.add(new FilledRectangle(width, height, color));
            }
            else
                System.out.println("Unknown command: " + input);
        }

        figures.sort((f1, f2) -> Double.compare(f1.calcArea(), f2.calcArea()));
        for (Figure figure : figures) {
            System.out.println(figure);
        }

    }
}
