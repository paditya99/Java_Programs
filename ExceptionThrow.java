class Sample{
    static void demo(){
        try{
            System.out.println("Inside Demo");
            throw new ArithmeticException() ;
        }
        catch(ArithmeticException e){
            System.out.println("hello");
        }
      
    }
}

public class ExceptionThrow {
    public static void main(String[] args) {
        Sample.demo();
    }
}
