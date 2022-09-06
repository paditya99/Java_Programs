import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements of array: ");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\nBefore sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nAfter sorting: ");
        //insertion sort
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while((j>=0) && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
