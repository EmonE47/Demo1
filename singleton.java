public class singleton{
    private static singleton ins =null;
    private singleton(){}
    public static singleton nothing(){
        if(ins==null){
            ins=new singleton();
            
        }
        return ins;
    }
}