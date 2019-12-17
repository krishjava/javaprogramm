class Mythread2 implements Runnable{
    table t;
    Mythread2(table t){
        this.t = t;
    }
    public void run(){
        t.cal(3);
    }
}