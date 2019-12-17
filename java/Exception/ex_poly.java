/**
 * ex_poly
 */
public class ex_poly {

    public static void main(String[] args) {
        try {
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
        } catch (Exception e) {
            System.out.println("Exception :"+e.getMessage());
            // This Example of Run time Polymorphism bcz 'e' is object of Exception class and object At 
           // run time received by 'e' of any child class. 'e' is reference but e.getMessage()
           // function of child class.  

        }
     }
}