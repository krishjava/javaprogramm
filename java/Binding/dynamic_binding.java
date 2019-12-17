class parent{
    void show(){
        System.out.println("Parent's Show()");
    }
    static void disp(){
        System.out.println("Display of Parent :");
    }
}
class child extends parent{
    void show(){
        System.out.println("child's Show()");
    }
    static void disp(){
        System.out.println("child's Display : ");
    }
    public static void main(String[] args) {
        parent a  = new child();
        a.show();  // This is Dynamic Method Dispetch or Run Time Poymorphism
        a.disp();  // Here Static Binding Is performed bcz Reference is Parent type 
        child b = new child();
        b.disp();
    }
}