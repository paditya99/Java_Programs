import java.util.Scanner;

class PersonInfo{
    String name;
    int age;

    PersonInfo(){
        System.out.println("Default Constructor called");
    }
    PersonInfo(String n,int a){
        name=n;
        age=a;
        System.out.println("Parameterised Contructer called");
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int a){
        age=a;
    }
    
}

public class Person {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String a=sc.nextLine();
        
        System.out.println("Enter the age: ");
        int x=sc.nextInt();
       
        PersonInfo per=new PersonInfo(a,x);
        System.out.println(per.getName()+ " "+per.getAge());
    }
    
}
