import java.util.*;
public class methods {
    public static void main (String[] args) {
        methods m = new methods(); // Method object
       
        int c,d;
        Scanner s =new Scanner(System.in); // Scanner object
        c = s.nextInt();
        d= s.nextInt();
        m.addName("Ravi","teja");
        int t = m.Addition(c,d);
        System.out.println(t);
        System.out.println(m.Addition(5,6));
        System.out.println(m.Addition(11,12));
        
    }
    // non return type function
    void addName( String a,String b)
    {
            System.out.println(a + b);

    }
    // return type function
    int Addition(int c, int d){

        return c+d;
    }
}
