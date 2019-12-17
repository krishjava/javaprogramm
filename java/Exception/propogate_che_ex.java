import java.io.IOException;

/**
 * propogate_che_ex
 */
// Propogate Checked Exception By 'throws' keyword 
class checked_ex{
    void show() throws java.io.IOException
    {
        System.out.println("Throw Exception ......");
        throw new IOException("MY Exception");
    }
    void disp()throws java.io.IOException{
        show();
        System.out.println("Display......");
    }
}
public class propogate_che_ex {
    public static void main(String[] args) {
        checked_ex ex = new checked_ex();
        //ex.disp();  // Here Exception not handled....
        try {
            ex.disp();
        } catch (Exception e) {
            System.out.println("Handled....."+e);
        }
    }
}