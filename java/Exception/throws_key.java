/**
 * throws_key
 */
class throwtest{
    void show() throws java.io.IOException
    {
        System.out.println("Throws");
    }
    void disp()throws java.io.IOException
    {
        show();
        System.out.println("Inside Display :");
    }
}
public class throws_key {

    public static void main(String[] args)throws java.io.IOException {
        throwtest t  = new throwtest();
        t.disp();
    }
}