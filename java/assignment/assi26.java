class parent{
    int x=10;
    parent(int a){
        System.out.println("A= "+a);
    }
}
class child extends parent{
    int x=20;
    child(){
        super(10);
        
        System.out.println(super.x);
    }
}
public class assi26 {

    public static void main(String[] args) {
        child c=new child();
    }
}