/**
 * syn_by_method
 */

import java.lang.*;
class table{
    synchronized public void cal(int a){
        System.out.println(Thread.currentThread().getName());
        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();;
            }
            System.err.println(i*a);
        }
    }
}
public class syn_by_method {
   public static void main(String[] args) {
    table t = new table();
    Mythread1 tt = new Mythread1(t);
    Thread t1 = new Thread(tt,"one");

    Mythread2 tt2 = new Mythread2(t);
    Thread t2 = new Thread(tt2,"two");

    Mythread3 tt3 = new Mythread3(t);
    Thread t3 = new Thread(tt3,"three");
    t1.start();
    t2.start();
    t3.start();
   }
    
}