class Test{
    int x;
    Test(){
        this(10);
    }
    Test(int x){
        this.x=x;
        this.access();
    }
    void access(){
        System.out.println(x);
    }
}


public class ThisStatement {
    public static void main(String[] args) {
        Test t=new Test();
    }
}
