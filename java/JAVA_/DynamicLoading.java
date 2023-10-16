import java.util.Scanner;

/* ========================= By CMD Line Argument =========================== */
/*

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
public class DynamicLoading {
    static{
        System.out.println("ClassLoading Static Block");
    }
    public static void main(String[] args) {
        try{
            String nameOfClass=args[0];
            Class.forName(nameOfClass);
        }
        catch(Exception){
            System.out.println("Enter the Class Name for Loading ....");
        }
    }
}

*/

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
public class DynamicLoading {
    static{
        System.out.println("ClassLoading Static Block");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of Class For Loading...");
        String nameOfClass=s.nextLine();
        try {
            Class.forName(nameOfClass);
        } catch (Exception e) {
            System.out.println("Enter the valid Class Name.......");
        }
    }
}