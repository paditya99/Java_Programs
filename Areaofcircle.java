import java.util.*;
public class Areaofcircle {
    public static void main(String args[]){
        System.out.println("Enter the radius: ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("Area of circle is: "+ area);

    }
}
