package interfaces;

public class Rectangle implements Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        System.out.println("Hello Rectangle");
        return height * width;
    }

    public double getPerimeter(){
        return (2 * height) + (2 * width);
    }


}
