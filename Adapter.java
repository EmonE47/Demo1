interface railroad{
    void moving();
}
class Car{
    public void drive(){
    System.out.println("Nothing");
    }
}
public class Adapter implements railroad{
    private Car car;
    public Adapter(Car car){
        this.car=car;
    }
    @Override
    public void moving(){
        System.out.println("Moving through adapter");
        car.drive();
    }
}
