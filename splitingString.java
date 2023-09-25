import java.util.*;
public class splitingString {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str = s.nextLine();
        String[] str2 = str.split(" ");
        for( String word : str2)
        {
            System.out.print(word +" : ");
            for(int i = word.length()-1 ; i>=0; i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print("\n");
        }
 
    }
}
