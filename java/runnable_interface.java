 import java.lang.*;
  class NewTread implements Runnable
 {
    Thread t;
    NewTread(){
       t = new Thread(this,"the");
       System.out.println("Child Thread "+t);
       t.start();
    }
    public void run(){
        try {
            for(int i=0; i<6; i++){
                Thread.sleep(2000);
                System.out.println("In Chlid Thread : "+i);
            }
        } catch (Exception e) {
            System.out.println("Child Thread Exception :");
        }
        System.out.println("Child Thread Exiting :");
    }
 }
public class runnable_interface {
    
        public static void main(String[] args) {
            new NewTread();
            try {
                for(int i=0; i<6; i++){
                    Thread.sleep(1000);
                    System.out.println("In main Thread : "+i);
                }
            } catch (Exception e) {
                System.out.println("Main Thread Exception :");
            }
            System.out.println("Main Thread Exiting :");
        }
    
}