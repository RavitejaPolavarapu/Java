
import java.util.*;
public class LCM {

    public static int maxNumber(int[] arr, int n)
    {
    int max =0;
     for (int i= 0 ; i < n ; i++)
     {
        if(max<arr[i])
        {
            
            max=arr[i];
           

        }
     }
     return max;
    }


    public static int LcmOfNumbers (int[] arr, int n , int max)
    {

     int sum = max;
     for (int i= 0 ; i < n ; i++)
     {
            while (sum % arr[i]!=0)
                {
                    
                    sum = sum + max ;
                    //System.out.println(sum + " " + max);
                }
    }
    return sum;
    } 

    
    public static void main (String[] ags)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i= 0 ; i < n ; i++)
        {
            arr[i] = s.nextInt(); 
        }
        int max = maxNumber(arr, n);
        System.out.print(LcmOfNumbers(arr,n,max));
        
    }
    
}
