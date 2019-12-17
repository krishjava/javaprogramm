/**
 * multiple_try_catch
 */
public class multiple_try_catch {

    public static void main(String[] args) {
        int i=0,j=0;
        try {
            String s=null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
       try {
            i=Integer.parseInt(args[0]); // 1. Exception cen occur ArrayIndexOutOfBoundsException
            j=Integer.parseInt(args[1]);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
       }
       catch(NumberFormatException e){
           System.out.println(e);
       }
       int z = i+j;
       System.out.println("Sum = "+z);  
       try {
       int z1 = i/j;                          // 3. ArithmeticException 
       System.out.println("Div = "+z1);
       } catch (ArithmeticException e) {
          System.out.println(e);
       }
       int z2 = i-j;
       System.out.println("Sub = "+z2);
       int z3 = i*j;
       System.out.println("Mul = "+z3);
    }
}