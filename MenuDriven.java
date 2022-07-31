import java.util.Scanner;
import java.io.*;

public class MenuDriven {
    public static void main(String[] args) {
        int a,b;
        System.out.println("1. Addition\n");
        System.out.println("2. Subtraction\n");
        System.out.println("3. Multiplication\n");
        System.out.println("4. Division\n");
        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        

        switch(choice){
            case 1:
            System.out.println("\nEnter first operand: ");
            a=sc.nextInt();
            System.out.println("\nEnter second operand: ");
             b=sc.nextInt();
             int ans1=a+b;
             System.out.println("Sum is: "+ans1);
             break;

            case 2:
            System.out.println("\nEnter first operand: ");
             a=sc.nextInt();
            System.out.println("\nEnter second operand: ");
            b=sc.nextInt();
             int ans2=a-b;
             System.out.println("Answer is: "+ans2);
             break;

             case 3:
             System.out.println("\nEnter first operand: ");
             a=sc.nextInt();
             System.out.println("\nEnter second operand: ");
             b=sc.nextInt();
             int ans3=a*b;
             System.out.println("Product is: "+ans3);
             break;

             case 4:
             System.out.println("\nEnter first operand: ");
             a=sc.nextInt();
             System.out.println("\nEnter second operand: ");
             b=sc.nextInt();
             int ans4=a/b;
             System.out.println("Quotient is: "+ans4);
             break;

             default:
             System.out.println("\nINVALID INPUT\n");
             break;
        }

    }
}
