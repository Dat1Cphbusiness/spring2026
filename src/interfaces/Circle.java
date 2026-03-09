package interfaces;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double result = 0.0;
        result = Math.PI * (radius * radius);
        System.out.println("Hello from Circle");
        return result;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * (2 * radius);
    }
}
