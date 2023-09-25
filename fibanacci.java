import java.util.Scanner;
public class fibanacci {
    public static void main( String[] args)
    {
        int n;
        int a=0,b=1,c;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i =1;i<=n;i++){

            System.out.print(a + " ");
            
            c=a+b;
            a=b;
            b=c;

        }


        
    }
}
