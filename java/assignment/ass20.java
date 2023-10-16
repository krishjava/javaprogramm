/**
 * ass20
 */
public class ass20 {
    void test(){
       System.out.println("This is for Test...");     
    }
    void test(int a){
        System.out.println(a);
    }
    void test(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    double test(double a){
        return a;
    }
    public static void main(String[] args) {
        ass20 t=new ass20();
       t.test();
       t.test(10);
       t.test(100, 20);
       System.out.println(t.test(10.235658));
    }
}