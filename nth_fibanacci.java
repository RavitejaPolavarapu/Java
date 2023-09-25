import java.util.Scanner;
public class nth_fibanacci {
    public static void main( String[] args)
    {
        int n;
        int a=0,b=1,c,ct=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i =1;i<=n;i++){
           
            ct++;
            c=a+b;
            if (ct==n)
            {

                System.out.print(a);
            }
            a=b;
            b=c;
            
            
        }
    }
}
