class One{
    static void show(){
        System.out.println("Class One showed");
    }
}

class Two extends One{
    static void show(){
        System.out.println("Class Two showed");
    }
}

public class PolymorphismByStatic {
    public static void main(String[] args) {
        Two.show();
        One.show();
        One o=new Two();
        o.show();
    }
}
