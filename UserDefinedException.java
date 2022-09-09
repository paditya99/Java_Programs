
public class UserDefinedException extends Exception{
    static int accNo[]= {101,102,103};
    static String name[]={"Raju","Ravi","Ram"};
    static int bal[]={10000,3000,500};
    
    UserDefinedException(String str){
        super(str);
    }

    public static void main(String[] args) {
        try{
            System.out.print("Account No"+"\t"+"Name"+"\t"+"Balance");
            for(int i=0;i<3;i++){
                System.out.print(accNo[i]+"\t"+name+"\t"+bal);
                if(bal[i]<1000){
                    UserDefinedException e=new UserDefinedException("Balance is less than 1000");
                    throw e;
                }
            }
        }
        catch(UserDefinedException e){
            System.out.println(e);
        }
        
    }
}
