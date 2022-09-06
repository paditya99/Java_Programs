abstract class Car{
    int regNo;
    Car(int r){
        regNo=r;
    }
    void opentank(){
        System.out.println("Fill the tank");
    }

    abstract void steering();
    abstract void braking();
}

class Maruti extends Car{
    Maruti(int r){
        super(r);
    }
    void steering(){
        System.out.println("Ordinary steering");
    }
    void braking(){
        System.out.println("Simple brake");
    }
}

class Santro extends Car{
    Santro(int r){
        super(r);
    }
    void steering(){
        System.out.println("Power steering");
    }
    void braking(){
        System.out.println("Power brake");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Maruti m=new Maruti(123);
        Santro s=new Santro(234);
        Car ref1=m;
        Car ref2=s;
        ref1.opentank();
        ref1.steering();
        ref1.braking();
        ref2.opentank();
        ref2.steering();
        ref2.braking();

    }
}
