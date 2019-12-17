/**
 * join_method
 */
class join_A extends Thread{
    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Thread Name = "+Thread.currentThread().getName());
        }
    }
}
public class join_method {

    public static void main(String[] args) {
        join_A a= new join_A();
        a.setName("my");
        System.out.println(a.isAlive());
        a.start();
        System.out.println(a.isAlive());
        try {
            a.join();
        } catch (Exception e) {
            System.out.println("Exception "+e);
        }
        System.out.println(a.isAlive());
        join_A a1 = new join_A();
        a1.setName("me");
        a1.start();
       
    }
}