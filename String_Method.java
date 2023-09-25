import java.util.*;
public class String_Method {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Names: ");
        String name = s.nextLine();       
        String name2[] = name.split(" ");
        printEachWord(name2);
        printnumber(name2);
    }
      

        public static void printEachWord(String[] name2) {
            System.out.println("Each word of String : ");
        for( String word: name2){

           System.out.print(word + " ");
        }
        System.out.print("\n");
    }

        public static void printnumber(String name2[])
        {
            System.out.println("Numbers in the string : ");
            for( String word: name2){
                for(int j=0;j<word.length();j++){
                    char c = word.charAt(j);
                    if((c>='A' && c<='Z') || (c>='a' && c<='z') ){

                        continue;
                    }
                    else
                    {
                        System.out.print(c);
                    }
               
                }
             }
        }
       

    
}
