import java.io.IOException;

/**
 * che_ex_propo
 */class Test_cecked{
    void show(){
        System.out.println("Show");
        try {
            throw new IOException("Admin");
        } catch (IOException e) {
            System.out.println(e);
        }
        
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
public class che_ex_propo {
    public static void main(String[] args) {
        Test_cecked t = new Test_cecked();
        t.set();
    }
}