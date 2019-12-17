import java.util.Scanner;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Login login  = new Login();
        System.out.println("Enter your Name :");
        Scanner s = new Scanner(System.in);
        String n=s.nextLine();
        System.out.println("Enter your Password : ");
        String p = s.nextLine();
        login.setName(n);
        login.setPass(p);

        String msg = validation.validate(login);
        if(msg.equals("Success"))
            {System.out.println("Login successfully :");}
        else
            {System.err.println("Login Failed : ");
            }
        System.out.println("Name = "+login.getName());
        System.out.println("Password = "+login.getPass());
    }
}