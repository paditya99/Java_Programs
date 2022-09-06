import java.util.*;
public class Test {
    

	public static void main(String[] args) {
	//	System.out.println("Hello World");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	sc.skip("\n");
	String s[] = new String[size];
	 for(int i=0;i<size;i++)
	 {
	     s[i] =sc.nextLine();
	 }
	 System.out.println("Array is: ");
	 for(int i=0;i<size;i++)
	 {
	     System.out.print(s[i]+"\n");
	 }
	 
	}
}


