class Mythread3 implements Runnable{
    table t;
    Mythread3(table t){
        this.t = t;
    }
    public void run(){
        t.cal(4);
    }
}