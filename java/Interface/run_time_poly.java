// Run Time Polymorphism By Interface
interface myinterface{
    void show();
    void disp();
}
class inter implements myinterface{
    public void show(){
        System.out.println("Show Of Inter :");
    }
    public void disp(){
        System.out.println("Display Of Inter");
    }
    public static void main(String[] args) {
        myinterface i = new inter();
        i.show();
        i.disp();
    }
}
