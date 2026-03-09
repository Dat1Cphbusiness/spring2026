package interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList();

        double totalArea = 0;

        for(Shape s: shapes){
            totalArea += s.getArea();
        }


    }
}
