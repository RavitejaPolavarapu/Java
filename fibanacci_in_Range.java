import java.util.Scanner;
public class fibanacci_in_Range {
    public static void main( String[] args)
    {
        int n,m;
        long a=0,b=1,c; //ct=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        for(int i =1;i<=m;i++){
           
       //     ct++;
            c=a+b;
            if (i>=n && i<=m)
            {

                System.out.println(a + " ");
            }
            a=b;
            b=c;
            
            
        }
    }
}
