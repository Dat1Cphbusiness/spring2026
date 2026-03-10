package hierachy;

public class C extends B{
    @Override
    public void print(){
        super.print();
        System.out.println("print from C");
    }
}
