/**
 * static_syn
 */
class table{
    static synchronized public void cal(int a){
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
class Mythread1 implements Runnable{
    table t;
    Mythread1(table t){
        this.t = t;
    }
    public void run(){
        table.cal(2);
    }
}
class Mythread2 implements Runnable{
    table t;
    Mythread2(table t){
        this.t = t;
    }
    public void run(){
        table.cal(3);
    }
}
class Mythread3 implements Runnable{
    table t;
    Mythread3(table t){
        this.t = t;
    }
    public void run(){
        table.cal(4);
    }
}
class Mythread4 implements Runnable{
    table t;
    Mythread4(table t){
        this.t = t;
    }
    public void run(){
        table.cal(5);
    }
}
public class static_syn {

    public static void main(String[] args) {
        table t = new table();
        table g= new table();
        Mythread1 tt = new Mythread1(t);
        Thread t1 = new Thread(tt,"one");
    
        Mythread2 tt2 = new Mythread2(t);
        Thread t2 = new Thread(tt2,"two");
    
        Mythread3 tt3 = new Mythread3(g);
        Thread t3 = new Thread(tt3,"three");

        Mythread4 tt4 = new Mythread4(g);
        Thread t4 = new Thread(tt4,"three");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
       }
}