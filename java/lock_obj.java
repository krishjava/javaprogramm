 /**
  * lock_obj
  */
 public class lock_obj implements Runnable {
    public void run() 
    { 
        Lock(); 
    } 
    public void Lock() 
    { 
        System.out.println(Thread.currentThread().getName()); 
        synchronized(this) 
        { 
            System.out.println("in block "
                + Thread.currentThread().getName()); 
            System.out.println("in block " +  
                Thread.currentThread().getName() + " end"); 
        } 
    } 
     public static void main(String[] args) {
         lock_obj a  = new lock_obj();
         Thread t = new Thread(a,"my");
         t.start();
     }
 }