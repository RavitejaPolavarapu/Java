import java.util.*;
public class loops {
    public static void main( String[] args){
        int n,m;
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        m=s.nextInt();
        for(int i=0 ;i<=m;i++) {

            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}

