class A{
    int x=10;
    void show(){
        System.out.println("Show of A");
    }
}
class B extends A{
    int x=20;
    public static void main(String[] args) {
        B b = new B();
        A a = new B();
        System.out.println(b.x);
        System.out.println(a.x);
    }
}