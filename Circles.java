import java.util.HashMap;
import java.util.Scanner;

class CircleV2 implements Comparable<CircleV2>{
    private int id;
    private double radius;

    private static int lastId = 0;

    public CircleV2(double radius) {
        this.radius = radius;
        this.id = ++lastId;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Circle #%d (r=%.2f)", this.id, this.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CircleV2))
            return false;
        CircleV2 otherCircle = (CircleV2) obj;
        return this.radius == otherCircle.radius;
    }

    @Override
    public int compareTo(CircleV2 otherCircle) {
        return Double.compare(this.radius, otherCircle.radius);
    }
}


public class Circles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, CircleV2> circles = new HashMap<>();
        while (true) {
            String cmdLine = scanner.nextLine();
            if(cmdLine.equals("stop")){
                System.out.println("Goodbye");
                break;
            }
            String[] cmdParts = cmdLine.split(" ");
            if(cmdParts[0].equals("circle")){
                double radius = Double.parseDouble(cmdParts[1]);
                CircleV2 circle = new CircleV2(radius);
                circles.put(circle.getId(), circle);
                System.out.println("Added: " + circle);
            }
            else if(cmdParts[0].equals("compare")){
                int c1 = Integer.parseInt(cmdParts[1]);
                int c2 = Integer.parseInt(cmdParts[2]);
                CircleV2 circle1 = circles.get(c1);
                CircleV2 circle2 = circles.get(c2);
                int compareResult = circle1.compareTo(circle2);

                System.out.printf("Circle #%d %s Circle #%d\n",circle1.getId(), getSign(compareResult), circle2.getId());
            }
        }

    }

    private static String getSign(int compareResult) {
        if (compareResult < 0)
            return "<";
        else if (compareResult > 0)
            return ">";
        return "==";
    }
}
