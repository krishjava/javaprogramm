/**
 * anonymous
 */
public class anonymous {

    public static void main(String[] args) {
        Thread t=new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.setName("my");
        t.start();
        Thread t1=new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.setName("me");
        t1.start();
    }
}
class anonymous2{ ///This is Another method of Anonymous class
    public static void main(String[] args) {
        new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}