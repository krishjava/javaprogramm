/**
 * single_method_over
 */
public class single_method_over {

    void show(int ...x){
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
        }
    }
    public static void main(String[] args) {
        single_method_over s = new single_method_over();
        s.show();
        s.show(1);
        s.show(2,5);
        s.show(7,8,9);
    }
}