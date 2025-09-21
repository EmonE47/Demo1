public class factory {
    public Shape getShape(String s){
        if(s==null) return null;
        else if(s=="circle"){
          return new circle();
        }
        else if(s=="square") return new square();
        return null;
    } 
}
interface Shape{
  void draw();
}
class square implements Shape{
  @Override
  public void draw(){
    System.out.println("Sqare");
  }
}
class circle implements Shape{
  @Override
  public void draw(){
    System.out.println("Circle");
  }
}
