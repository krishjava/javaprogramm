class Mythread4 implements Runnable{
    table t;
    Mythread4(table t){
        this.t = t;
    }
    public void run(){
        t.cal(5);
    }
}