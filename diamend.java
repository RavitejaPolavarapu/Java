import java.util.*;
public class diamend {
    public static void main(String[] args)

    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]= new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                 
                    arr[i][j]= 1;
                }
                else
                {
                
                   arr[i][j]=arr[i-1][j-1] + arr[i-1][j];
                }
            }
       
        }
        for(int i=0;i<n;i++)
        {
          //  System.out.print("{ ");
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        System.out.print("\n");
        } 
    }
}
