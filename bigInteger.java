import java.util.*;
import java.math.*;
//import java.math.MutableBigInteger;
public class bigInteger {
    
    public static void main(String[] args) {
        
        String S1="12345678901565475478686756568568725345345477747657226654768226565464372746746767567375474";
        BigInteger b1 = new BigInteger(S1);
        BigInteger b2 = new BigInteger(S1);

        BigInteger b3 = b1.multiply(b2);

        System.out.println(b3);


    }
}
