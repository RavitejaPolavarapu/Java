import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();

        hallowRectangle(n);
        System.out.println("1)");
        triangle(n);
        System.out.println("2)");
       binaryTriangle(n); //0 1 0 1
       System.out.println("3)");
        advancePattern1(n);
        System.out.println("4)");
        advancePattern2(n);
        System.out.println("5)");
        advancePattern3(n);
        System.out.println("6)");
        AdvancePattern4(n);
    }

    // hallow  rectangle
    // *****
    // *   *
    // *   *
    // *****
    public static void hallowRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if(i==0|| i==n-1 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else if (j>0 && j<n-1)
                {
                    System.out.print(" ");
                }
                
            }
            System.out.print("\n");
        }  
    }


    public static void triangle(int n){
        int a=n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
               if(j<=a)
               {
                System.out.print(" ");
               }
               else if (j>a){

                System.out.print("*");
               }
                
            }
            System.out.print("\n");
            a--;
        } 

    }

    public static void binaryTriangle(int n){
        /*
             1
             0 1
             1 0 1
             0 1 0 1
             1 0 1 0 1
         */

       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                if(i%2==0 && j%2!=0)
                {
                    System.out.print("0");
                }
                else if(i%2==0 && j%2==0)
                {
                     System.out.print("1");
                }
                else if (i%2!=0 && j%2==0)
                {
                    System.out.print("0");
                }
                else if(i%2!=0 && j%2!=0)
                {
                    System.out.print("1");
                }
               
              
                
            }
            System.out.print("\n");
            
        } 
    }

    public static void advancePattern1(int n){

        /*

              *             *
              * *         * *
         *    * * *     * * *
         *    * * * * * * * *   n=4
         *    * * * * * * * *
         *    * * *     * * *
         *    * *         * *
         *    *             *
         */ 
        
        //First half
        int sp=n+n-2;

       for (int i = 1; i <= n; i++) {
            // first part
            for (int j = 1; j <=i ; j++) {
                  System.out.print("*"); 

                }
            // spaces
            for(int j =1;j<=sp ; j++)
            {
                System.out.print(" ");
            }

            // second part
            for (int j = 1; j <=i ; j++) {
                  System.out.print("*"); 

                }

            System.out.print("\n");
            sp=sp-2;
            
        } 


       // Second half
        sp=0;
       for (int i = n; i >= 1; i--) {
            //first part
            for (int j = 1; j <=i ; j++) {
                  System.out.print("*"); 

                }
            
            // spaces
            for(int j =1;j<=sp ; j++)
            {
                System.out.print(" ");
            }

            // second part
            for (int j = 1; j <=i ; j++) {
                  System.out.print("*"); 

                }

            System.out.print("\n");
            sp=sp+2;
            
        } 
        
        
    }

    public static void advancePattern2(int n)
    {
        /*          
                     * * * * 
                   * * * *
         *       * * * *
         *     * * * *
         *     n=4
         */
        int sp =n-1;
          for (int i = 1; i <= n; i++) {
            
            // spaces
            for(int j =1;j<=sp ; j++)
            {
                System.out.print(" ");
            }

            // star printing
            for (int j = 1; j <=n ; j++) {
                  System.out.print("*"); 

                }

            System.out.print("\n");
            sp=sp-1;
            
        } 



    }

    public static void advancePattern3(int n){
        /*
            1 2 3 4 5 6 7 8 9
         *          1
         *        2   2
         *      3   3   3  
         *    4   4   4   4
         *  5   5   5   5   5
         * 
         *         n=5
         * 
         * 
         * 
         */
        int sp = n-1;
         for (int i = 1; i <= n; i++) {
           
            // spaces
            for(int j =1;j<=sp ; j++)
            {
                System.out.print(" ");
            }

            // stars and space
            for (int j = 1; j <=i+i-1 ; j++) {
                    if(j%2!=0)
                    {
                        System.out.print(i); 
                    }
                    else 
                    {
                        System.out.print(" ");
                    }

                }
            
            
            // spaces
            for(int j =1;j<=sp ; j++)
            {
                System.out.print(" ");
            }

            System.out.print("\n");
            sp=sp-1;
            
        } 


    }

    public static void AdvancePattern4(int n){
        int sp=n-1;
        for(int i=1 ; i<=n ; i++)
        {
            //Spaces
            for(int j=1; j<=sp; j++)
            {
                System.out.print(" ");
            }
            sp = sp-1;

            //Number
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            // numbers
            for(int j=1; j<i; j++)
            {
                System.out.print(j+1);
            }


            System.out.println();

        }
    }
    
}
