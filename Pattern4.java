public class Pattern4 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            if(i==0 || i==4){
                for(j=0;j<5;j++){
                    System.out.print("*");
                }
            }
            else{
                
                for(j=0;j<5;j++){
                    if(j==0 || j==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
