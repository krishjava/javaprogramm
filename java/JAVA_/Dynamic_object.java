import java.util.Scanner;
class A{
     A(){
         System.out.println("A class loaded");
     }
}
class B{
    B(){
        System.out.println("B class loaded");
    }
}
public class Dynamic_object {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of Class For Loading...");
        String nameOfClass=s.nextLine();
        try {
            Class c=Class.forName(nameOfClass); // This returns the 'Class' objects for every class it is different for every class
            System.out.println(c);
            c.newInstance();
        } catch (Exception e) {
            System.out.println("Enter the valid Class Name.......");
        }
    }
}