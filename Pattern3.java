public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }

        for(int i=5;i>0;i--){
            
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
