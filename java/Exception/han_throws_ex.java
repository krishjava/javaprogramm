/**
 * han_throws_ex
 */
class han_throws{
    void show() throws java.io.IOException
    {
        System.out.println("Throws");
    }
    void disp()
    {
        try {
            show();
        } catch (Exception e) {
            System.out.println("Handle....."+e);
        }
        System.out.println("Inside Display :");
    }
}
public class han_throws_ex {
    public static void main(String[] args) {
        han_throws h= new han_throws();
        h.disp();
    }
}