import java.util.Scanner;

class Parent{
    int x=10;
    static int y=100;
    void show(){
        System.out.println("Show of Parent");
    }
}
class Base extends Parent{
    int x=20;
    static int y=200;
    void show(){
        System.out.println("Show of Base");
    }
}
public class runtime_by_scanner {
    public static void main(String[] args) {
        
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter The Class Name Parent OR Base :");
            String name  = s.nextLine();
            Class c = Class.forName(name);
           Parent b = (Parent)c.newInstance();
           b.show();
           System.out.println(b.x);
           System.out.println(b.y);
        } catch (Exception e) {
            System.out.println();
        }
    }

}