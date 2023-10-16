/**
 * compareToIgnoreCase_fun
 */
public class compareToIgnoreCase_fun {

    public static void main(String[] args) {
        String str1 = "krishan", str2 = "Mah";
   
  
        int retval = str1.compareToIgnoreCase(str2);
  
        if (retval > 0) {
           System.out.println("str1 is greater than str2");
        } else if (retval == 0) {
           System.out.println("str1 is equal to str2");
        } else {
           System.out.println("str1 is less than str2");
        }
    }
}