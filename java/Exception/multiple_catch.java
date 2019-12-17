/**
 * multiple_catch
 */
public class multiple_catch {

    public static void main(String[] args) {
        try{
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
        catch(NumberFormatException n){
            System.out.println("Input Valid number : "+n);
        }
        catch(ArrayIndexOutOfBoundsException n){
            System.out.println("Please Input proper Input : "+n);
        }
        catch(ArithmeticException n){
            System.out.println("Invalid Operation : ");
        }
    }
}