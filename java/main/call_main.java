/**
 * call_main
 */
class A{
    public static void main(String[] args) {
        System.out.println("A main.......");
    }
}
public class call_main {

    public static void main(String[] args) {
        String ar[]={"krishan"};
        A.main(ar);
        System.out.println("Call main()");
    }
}