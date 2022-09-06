public class Pattern6 {
    public static void main(String[] args) {
        int a=0;
        for(int i=0;i<5;i++){
            a=0;
            for(int j=0;j<(5-i-1);j++){
                System.out.print(" ");
            }
            
            for(int j=0;j<=i;j++){
                a++;
                System.out.print(a);
            }
            for(int j=0;j<i;j++){
                a--;
                System.out.print(a);
            }
            System.out.println();

        }
    }
}
