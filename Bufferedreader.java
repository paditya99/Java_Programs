import java.io.*;
public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        char gender=br.readLine().charAt(0);
        float f=Float.parseFloat(br.readLine());
        System.out.println(a);
        System.out.println(gender);
        System.out.println(f);
    }
}
