/**
 * propogate
 */
class Testing{
    void show(){
        System.out.println("Show");
        //int x=10/0;
        throw new ArithmeticException("Admin");
    }
    void disp(){
        System.out.println("Display");
        show();
    }
    void set(){
        System.out.println("Set");
        disp();
    }
}
public class propogate {
    public static void main(String[] args) {
    Testing to  = new Testing();
    try {
        to.set();
    } catch (ArithmeticException e) {
        //System.out.println(e);
        e.printStackTrace();
    }
    }  
}