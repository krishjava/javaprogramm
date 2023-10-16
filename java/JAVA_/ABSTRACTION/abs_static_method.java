abstract public class abs_static_method {
    static void show(){
        System.out.println("Static method");
    }
    void disp(){
        System.out.println("disp");
    }
}
class test extends abs_static_method{
    public static void main(String[] args) {
        test t=new test();
        t.disp();
        abs_static_method.show();
    }
}