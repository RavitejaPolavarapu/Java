import java.util.*;
public class uniques_and_duplicates_Sets {
    public static void main(String[] args)
    {
        HashSet<Integer> u = new HashSet<>();
         HashSet<Integer> d = new HashSet<>();
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         for(int i =1; i<=n ; i++)
         {
            int a = s.nextInt();
            if(!u.add(a))
            {
                d.add(a);
            }
         }

         retainall(u, d);
         u.removeAll(d);

         System.out.println(u + " "+ d);

    }

    static void retainall(HashSet<Integer>u,HashSet<Integer>d)
    {
        d.retainAll(ut);
        System.out.println(u + " "+ d);
    }
}
