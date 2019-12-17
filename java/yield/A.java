public class A extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("A class Thread :"+i+" Name is "+Thread.currentThread().getName());
        }
    }
}