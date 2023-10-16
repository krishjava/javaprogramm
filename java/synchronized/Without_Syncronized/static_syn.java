/**
 * Without_static_syn
 */class Table{
    //public void cal(int x) // Without Synchronize 
    static synchronized void cal(int x) // With Synchronize
    {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.err.print(x*i+"**");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class mythread1 implements Runnable{
  
    public void run(){
        Table.cal(2);
    }
}
class mythread2 implements Runnable{
    
    public void run(){
        Table.cal(3);
    }
}
class mythread3 implements Runnable{
     
    public void run(){
        Table.cal(6);
    }
}
class mythread4 implements Runnable{
 
    public void run(){
        Table.cal(12);
    }
}
public class static_syn {

    public static void main(String[] args) {
        Table t=new Table(); // First Lock
        Table s=new Table(); // Second LOck

        mythread1 t1=new mythread1();
        Thread t11=new Thread(t1,"first");

        mythread2 t2=new mythread2();
        Thread t22=new Thread(t2,"Second");

        mythread3 t3=new mythread3();
        Thread t33=new Thread(t3,"third");

        mythread4 t4=new mythread4();
        Thread t44=new Thread(t4,"third");

        t11.start();
        t22.start();
        t33.start();
        t44.start();
    }
}