
class Base{
    int x=10;
}
public class super1 extends Base {
    int x=20;
    public static void main(String[] args) {
        // super1 s=new super1();
        Base s1=new super1();
        Object s2=new super1();

        // System.out.println(s.x);
        System.out.println(s1.x);
        // System.out.println(s2.x);
    }
}