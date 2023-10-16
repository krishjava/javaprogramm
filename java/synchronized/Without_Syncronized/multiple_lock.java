/**
 * Without_syn
 */
class Table{
    //public void cal(int x) // Without Synchronize 
    synchronized public void cal(int x) // With Synchronize
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
    Table t;
    mythread1(Table t){
        this.t = t;
    }
    public void run(){
        t.cal(2);
    }
}
class mythread2 implements Runnable{
    Table t;
    mythread2(Table t){
        this.t = t;
    }
    public void run(){
        t.cal(3);
    }
}
class mythread3 implements Runnable{
    Table t;
    mythread3(Table t){
        this.t = t;
    }
    public void run(){
        t.cal(6);
    }
}
/**
 * multiple_lock
 */
public class multiple_lock {

    public static void main(String[] args) {
        Table t=new Table(); // First Lock
        Table s=new Table(); // Second LOck
        Table a=new Table(); // Third Lock
        mythread1 t1=new mythread1(t);
        Thread t11=new Thread(t1,"first");

        mythread2 t2=new mythread2(s);
        Thread t22=new Thread(t2,"Second");

        mythread3 t3=new mythread3(a);
        Thread t33=new Thread(t3,"third");

        t11.start();
        t22.start();
        t33.start();
    }
}