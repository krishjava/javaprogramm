/**
 * single_try
 */
public class single_try {

    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
            int i=Integer.parseInt(args[0]); // 1. Exception cen occur ArrayIndexOutOfBoundsException
            int j=Integer.parseInt(args[1]);  // 2. NumberFormatException bcz instead of int user can enter string
            int z = i+j;
            System.out.println("Sum = "+z);  
            int z1 = i/j;                          // 3. ArithmeticException 
            System.out.println("Div = "+z1);
            int z2 = i-j;
            System.out.println("Sub = "+z2);
            int z3 = i*j;
            System.out.println("Mul = "+z3);
        } 
        catch (Exception e) {
           if(e instanceof ArrayIndexOutOfBoundsException){
               System.out.println("Proper Input :");
           }
           else if(e instanceof NumberFormatException){
               System.out.println("Valid input : " );
           }
           else if(e instanceof ArithmeticException){
               System.out.println("Invalid Arithmetic Operation :");
           }
           else // if (e instanceof Exception) 
           {
               System.out.println("Invalid Exception :"+e);
           }
        }
        System.out.println("Normal Flow......");
    }
}