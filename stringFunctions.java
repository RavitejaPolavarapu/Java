import java.util.*;
public class stringFunctions {
    public static void main ( String[] args) {
        String str = "Raviteja";
        String str2 = "Ravitej";
        System.out.println("length = " + str.length());
        System.out.println("char at index(2) = " +str.charAt(2));
        System.out.println("lower case = " + str.toLowerCase());
        System.out.println("upper case = "+str.toUpperCase());
        System.out.println("Concatination of two strings = "+ str.concat(str2));
        System.out.println("index of R = "+str.indexOf('R'));
        System.out.println("repace space with + = " + str.replace(' ', '+'));
     //   System.out.println(str.stringFunctions());
        System.out.println("sunstring from 2nd index = " + str.substring(2));
      //  System.out.println("sunstring from 2nd index to 10th index = " + str.substring(2,10));
        System.out.println("whether string contains (good) = " + str.contains("good"));
        System.out.println("\nTwo strings equal or not + " + str.equals(str2));
        
        
        System.out.println("Two strings compare + " + str.compareTo(str2));
    }
}
