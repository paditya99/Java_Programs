class First{

    First(){
        sum(2,3);
        sum(2,3,4);
    }

    private void sum(int x,int y){
        System.out.println("Sum is: "+ (x+y));
    }

    private void sum(int x,int y,int z){
        System.out.println("Sum is: "+ (x+y+z));
    }

}

public class PolymorphismByPrivate {
    public static void main(String[] args) {
        First s=new First();
        
    }
}
