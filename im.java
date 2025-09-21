public class im {
    public static void main(String [] args){
        Image imag = new Proxy("File1");
        imag.display();
        System.out.println(""); 
        imag.display();
    }
}
interface Image{
    void display();
}
class Real implements Image{
    String filename;
    // private real(){}
   public Real(String filename){
     this.filename=filename;
     Load(filename);
   }
   @Override
   public void display(){
     System.out.println("displaying Real" + filename); 
   }
   public void Load(String filename){
    System.out.println("Loading Real" + filename);
   }
}
class Proxy implements Image{
    private Real real;
    private String filename;
    public Proxy(String filename){
        this.filename=filename;
    }
    @Override
    public void display(){
        if(real==null){
            real = new Real(filename);
        }
        real.display();
    }

}