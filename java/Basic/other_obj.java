class A{
    boolean compare(A a){
        System.out.println(a);
        return false;
    }
}
class B extends A{
    String set(){
        return "hello";
    }
    public static void main(String[] args) {
        B b = new B();
        
        System.out.println(b.set());
        new B().compare(b);
    }
}