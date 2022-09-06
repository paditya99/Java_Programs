interface Father{
    int prop=12000;
    
}

interface Mother{
    int prop=24000;
    
}

class Child implements Father,Mother{
    void show(){
        System.out.println(Father.prop+Mother.prop);
    }
}
public class Multi_Inheritance_Interface {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.show();
    }
}
