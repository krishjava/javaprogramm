interface A {
    int x=10;
    void show();
    private void disp(){
        System.out.println("This Private Method of interface.....");
    }
    static void hi(){
        System.out.println("hi Static ..");
    }
}
class Test implements A{
    public void show(){
        System.out.println("This is show...");
    }
    public static void main(String[] args) {
        A a=new Test();
        A.hi();
        a.show();
    }
}