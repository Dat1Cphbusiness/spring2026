package interfaces;

public class Triangle implements Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }

    @Override
    public double getArea(){
        System.out.println("Hello from Triangle");
        //double result = (a + b + c)/2;
        //return Math.sqrt(result * (result-a) * (result-b) * (result-c));
        return 12;
    }
}
