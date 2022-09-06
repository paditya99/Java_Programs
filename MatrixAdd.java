import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        System.out.println("Enter the "+(r*c)+" elements of first array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the "+(r*c)+" elements of second array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int arr3[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of two matrix is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
