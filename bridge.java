public class bridge {
    public static void main(String [] args){
        Shape s1 = new Square("red");
        s1.draw();
        Shape s2 = new circle("red");
        s2.draw();

    }
}
abstract class Shape{
  public String color;
  public Shape(String color){
    this.color=color;
  } 
  abstract void draw();
}
class Square extends Shape{
    public Square(String color){
        super(color);
    }
    @Override
    void draw(){
        System.out.println("Square : "+color);
    }
}
class circle extends Shape{
    public circle(String color){
        super(color);
    }
    @Override
    void draw(){
        System.out.println("Circle: "+color);
    }
}