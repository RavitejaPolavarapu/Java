import java.util.*;
public class nearsetPalidrom {

    //
    static boolean checkPalindrom(ArrayList<Integer> arr )
    {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i =arr.size()-1; i>=0 ; i--)
        {
            arr2.add(arr.get(i));
        }
       // System.out.println(arr2);
        if(arr2.equals(arr))
        {
           // System.out.println("dfgs");
            return true;
        }
        return false;
    }
    static ArrayList<Integer> palindromNear(ArrayList<Integer> arr , int n)
    {
        if(arr.size()==0)
        {
             arr.add(0);
             return arr;
        }
        boolean hint = true;
        while(hint)
        {
            arr.set(n-1,arr.get(n-1)+1);
            int carry = arr.get(n-1)/10;
            arr.set(n-1,arr.get(n-1)%10);

            for(int i=n-2; i>=0 ; i--)
            {
                if(carry==1)
                {
                   arr.set(i,arr.get(i)+1);
                   carry = arr.get(i)/10;
                   arr.set(i,arr.get(i)%10);
                }
                
            }

            if(carry==1)
            {
                arr.add(0,1);
            }

            if(checkPalindrom(arr))
            {
                hint = false;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n ; i++)
        {
            arr.add(s.nextInt());
        }

        palindromNear(arr,n);
        System.out.println(arr);
    }
}
