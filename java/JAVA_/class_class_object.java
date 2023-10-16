import java.util.Scanner;
class A{
    static{
        System.out.println("A Static Block");
    }
}
class B{
    static{
        System.out.println("B Static Block");
    }
}
public class class_class_object {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of Class For Loading...");
        String nameOfClass=s.nextLine();
        try {
            Class c=Class.forName(nameOfClass); // This returns the 'Class' objects for every class it is different for every class
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Enter the valid Class Name.......");
        }
    }
}