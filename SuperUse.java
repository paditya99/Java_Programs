class Animal2{
    String color="white";
}

class Dog extends Animal2{
    String color="brown";

    void printColor(){  
        System.out.println(color); 
        System.out.println(super.color);
    }  
}
public class SuperUse {
    public static void main(String[] args) {
        Dog d=new Dog();  
        d.printColor();  
    }
}
