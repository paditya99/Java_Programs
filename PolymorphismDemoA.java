class Demo{
    void sum(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}

class Demo2 extends Demo{
    void sum(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }
}

public class PolymorphismDemoA {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
       d.sum(3,6);
        d.sum(1,7,9);
       
    }
}
