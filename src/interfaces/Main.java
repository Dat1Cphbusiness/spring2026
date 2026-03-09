package interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(3.5, 4.5));
        shapes.add(new Triangle(3, 4.5, 7.8));

        double totalArea = 0;

        for(Shape s: shapes){
            totalArea += s.getArea();
        }
        System.out.println("Total area: " + totalArea);
    }
}
