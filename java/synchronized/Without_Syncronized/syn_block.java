/**
 * syn_block
 */
class Share{
    synchronized void show(){
        System.out.println("hello");
        System.out.println("kaise ");
        System.out.println("ho");
        //synchronized(this)  // For Object lock
        synchronized(Share.class)  // For Class lock
        {
            System.out.println("aap");
        System.out.println("abi");
        System.out.println("kya");
        }
        System.out.println("aap");
        System.out.println("abi");
        System.out.println("kya");
        System.out.println("raho");
        System.out.println("ho");
        System.out.println();
    }
}
class A extends Thread{
    Share share;
    A(Share share){
        this.share=share;
    }
    public void run(){
        share.show();
    }
}

class B extends Thread{
    Share share;
    B(Share share){
        this.share=share;
    }
    public void run(){
        share.show();
    }
}
public class syn_block {

    public static void main(String[] args) {
        Share share=new Share();
        A a=new A(share);
        B b=new B(share);
        a.start();
        b.start();
    }
}