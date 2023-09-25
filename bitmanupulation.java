/*  Bit manupulation 
 *  1. Finding the bit
 *  2. Set bit (0 --> 1 )
 *  3. clear bit (1 --> 0 ) 
 *  4. ipdate bit (0 --> 1 or 1 ---> 0)
 */

 
        /*
         *         5 = 1 0 1
         * index pos = 2 1 0
         */
import java.util.*;
public class bitmanupulation {
    

    //3. change the 0ne bit to zero bit or clear bit
    static int bitOneToZero(int x, int bitMask)
    {
            int notBitMask = ~(bitMask);

            return notBitMask & x;
    }


    //2. change the zero bit to one bit or set bit
    static int bitZeroToOne(int x, int bitMask)
    {
        int v = x | bitMask;
        return v;
    }



    //1.  finds the bit value at required position
    static int bitFinder(int x, int bitMask){
            
            if((x&bitMask) == 0)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        
    }


    public static void main(String args[]) {

        Scanner s  = new Scanner(System.in);
        int x=s.nextInt();
        int position =s.nextInt(); 
        int bitMask= 1<<position;
        String str=Integer.toBinaryString(x);
        System.out.println("Bit Representaion of "+x +" = "+str);

        //1. finds the bit value at required position
        System.out.println("1. finds the bit value at required position\n");
        System.out.println("Bit value at Position "+position+" is "+bitFinder(x, bitMask));
        System.out.println();
        
        //2. change the zero bit to one bit or set bit
        System.out.println("2. change the zero bit to one bit or set bit\n");
        int newNumber = bitZeroToOne(x, bitMask);

        System.out.println("Bit value at Position " +position+ " changer from " +bitFinder(x, bitMask)+  " to " + bitFinder(newNumber , bitMask));

        System.out.println("original value = " + x + " and " + "\nchanged value = " + newNumber);
        System.out.println();

        //3. change the 0ne bit to zero bit or clear bit
        
        System.out.println("3. change the 0ne bit to zero bit or clear bit\n");

        newNumber = bitOneToZero(x, bitMask);

        System.out.println("Bit value at Position " +position+ " changer from " +bitFinder(x, bitMask)+  " to " + bitFinder(newNumber , bitMask));

        System.out.println("original value = " + x + " and " + "\nchanged value = " + newNumber);
        System.out.println();

    
        }

}
