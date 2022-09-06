class Student{
    String name;
    int roll_no;

    Student(String n,int r){
        name=n;
        roll_no=r;
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student st1=new Student("Aditya", 01);
        Student st2=new Student("Pathak", 02);
        System.out.println(st1.name+ " "+st1.roll_no);
        System.out.println(st2.name+ " "+st2.roll_no);
    }
}
