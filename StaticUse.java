class Sample{
   
    static int x=10;
    static void dis(){
        System.out.println(x);
    }

}


public class StaticUse {
    public static void main(String[] args) {
        Sample s=new Sample();
        Sample s2=new Sample();
        ++s.x;
        s.dis();
        s2.dis();
        System.out.println("Main Block");
        
    }
}
