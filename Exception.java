import java.util.Scanner;

public class Exception {

    public static void divide(){

        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the first number: ");
            int x=sc.nextInt();
            System.out.println("Enter the second number: ");
            int y=sc.nextInt();
            int ans=x/y;
            System.out.println(ans);

        }
        catch(ArithmeticException a){
            System.out.println("Error you cannot enter 0");
        }

        finally{
            System.out.println("Hello");
        }
       
        

    }
    public static void main(String[] args) {
        divide();
    }
}
