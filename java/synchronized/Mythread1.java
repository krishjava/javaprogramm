class Mythread1 implements Runnable{
    table t;
    Mythread1(table t){
        this.t = t;
    }
    public void run(){
        t.cal(2);
    }
}