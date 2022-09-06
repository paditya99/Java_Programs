class Vehicle{
    void show(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    void show(){
        System.out.println("Bike is running safely");
    }
}

public class PolymorphismDemoB {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.show();
    }
}
