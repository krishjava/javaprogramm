class SeqRun implements Runnable{
   
    @Override
    public void run() {
     System.out.println("In run method " + Thread.currentThread().getName());
    } 
   }
public class join_method {

    public static void main(String[] args) {
     SeqRun sr = new SeqRun(); 
     Thread t1 = new Thread(sr);
     Thread t2 = new Thread(sr);
     Thread t3 = new Thread(sr);
     
     try { 
        t1.setName("First Thread");
      t1.start();
      t1.join(); 
      t2.start();
      t2.join(); 
      t3.start();
      t3.join();
     } catch (InterruptedException e) { 
      e.printStackTrace();
     }
    }
   }
   
   