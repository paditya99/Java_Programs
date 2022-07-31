public class ReverseAnum {
    public static void main(String[] args) {
        int n=123;
        int rem=0;
        int rev=0;
        int a=25;
        String s=Integer.toString(a);
        System.out.println("Reverse of number is: ");
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        System.out.println(s+5);
    }
}

