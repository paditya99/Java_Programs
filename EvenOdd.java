import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n;
        Scanner sc=new Scanner(System.in);  
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("\nNumber is even");
        }
        else{
            System.out.println("\nNumber is odd");
        }
    }
}
