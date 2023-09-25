public class calling_method_without_newFunction {

    // creating method with object
    public static void name(){  // using < static > word makes method to use wuthout onject creation

        System.out.println("Raviteja");
    }
    public static void roll_number(){

        System.out.println("20A95A0137");
    }

    // creating object with object creation
    
    public void studentgrade(){
        System.out.print("A");
    }
    public static void main(String[] args){

        calling_method_without_newFunction m = new calling_method_without_newFunction();
        
        // calling a function withoout object creation
        name();
        roll_number();

        // calling a function with object creation
        m.studentgrade();

    }
   
}
