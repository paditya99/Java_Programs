class Test1{
    int x,y;

    void add(int x,int y){
        int z=x+y;
        System.out.println("The sum is: "+ z);
    }
    
}

public class MethodUse {
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.add(5, 3);
        
        
    }
}
