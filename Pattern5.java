public class Pattern5 {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
           
                if(i==0 || i==n-1){
                    for(int j=n-i;j>0;j--){
                        System.out.print("*");
                    }
                    
                 }
                 else{
                    for(int j=n-i;j>0;j--){
                        if(j==n-i || j==1){
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
