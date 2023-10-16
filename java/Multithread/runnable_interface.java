/**
 * runnable_interface
 */
class createThread implements Runnable {
   public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class runnable_interface {

    public static void main(String[] args) {
        createThread c=new createThread();
        Thread t=new Thread(c);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t.setName("my");
        t.start();
        Thread t1=new Thread(new createThread()); // This is Anonymous object
        t1.setName("me");
        t1.setPriority(2);
        t1.start();
    }
}