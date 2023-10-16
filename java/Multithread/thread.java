/**
 * thread
 */
class createthread extends Thread {
    public void run(){
        try {
            sleep(2000);
            System.out.println(Thread.currentThread().getName()); // This is Task
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}
public class thread {

    public static void main(String[] args) {
        createthread c=new createthread();
        c.setName("My");
        c.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        createthread c1=new createthread();
        c1.setName("Me");
        c1.start();
        System.out.println(Thread.currentThread().getName());
        
    }
}