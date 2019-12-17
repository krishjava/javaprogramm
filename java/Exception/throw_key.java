import java.util.Scanner;

/**
 * throw_key
 */
class test{
    public static void valid(int age){
        if(age<18){
            try{
                throw new ArithmeticException("Invalid Age ?");
                // This line not acceptable bcz Don't keep  any statement after 'throw keyword' 
               // System.out.println("flow");
            }
            catch(ArithmeticException a){
                System.out.println(a);
            }
        }
        else{
            System.out.println("Procedd");
        }
    }
}
public class throw_key {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age=s.nextInt();
        test.valid(age);
    }
}