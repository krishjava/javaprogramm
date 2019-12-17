 

/**
 * validation
 */
public class validation {

    public static String validate(Login login){
        String n = login.getName();
        String p = login.getPass();
        if(n.equals("admin") && p.equals("admin"))
            return "Success";
        else
            return "Failed";
    }
}