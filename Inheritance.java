class Animal{
    int legs;

    Animal(int l){
        legs=l;
    }
}

class Cow extends Animal{
    Cow(int l){
        super(l);
    }
    void display(){
        System.out.println("Cow has "+ legs +" legs.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cow c=new Cow(4);
        c.display();
    }
}
