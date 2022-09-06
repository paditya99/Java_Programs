import java.util.*;
public class EmpDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int id=sc.nextInt();
        System.out.println("Enter employee gender: ");
        char gender=sc.next().charAt(0);
        
        sc.nextLine();
        System.out.println("Enter employee name: ");
        String name=sc.nextLine();
        
        System.out.println("Enter salary: ");
        float sal=sc.nextFloat();
        System.out.println("\nEmployee Details are: ");
        System.out.print("Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSalary: "+sal);
    }
}
